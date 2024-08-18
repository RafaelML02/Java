package clase;
import es.upm.babel.cclib.Monitor;

import es.upm.babel.cclib.ConcIO;

import java.util.Arrays;

// C-TAD Mesa
public class Mesa
{

// OPERACIONES 
// ACCION cogerTenedores:N[e]
// ACCION soltarTenedores:N[e]

// SEMANTICA 
// DOMINIO:
// TIPO : Mesa = N → B
	// disponible_tenedor[i] es el de la izquierda de i
	// disponible_tenedor[(i + 1) % 5] es el de la derecha de i
	private boolean disponible_tenedor[] = new boolean [SITIOS];

	public static final int SITIOS = 5;

// TODO: declaración de atributos extras necesarios
	private Monitor mutex = new Monitor(); 
	private Monitor.Cond condTenedores [] = new Monitor.Cond [SITIOS];

	private void imprime_estado()
	{
		ConcIO.printfnl("Estado actual " + Arrays.toString(disponible_tenedor));
	}

// INVARIANTE: dom self = {0, 1, 2, 3, 4}

// INICIAL: ∀ i ∈ {0, 1, 2, 3, 4} • self(i)
	public Mesa()
	{
		for(int i=0; i< SITIOS; i++)
		{
			disponible_tenedor[i] = true;
			condTenedores[i] = mutex.newCond();
		}
	}

// PRE: i ≤ 4
// CPRE: self(i) ∧ self((i+1) % 5)
// cogerTenedores(i)
// POST: self = self ⊕ {i → Falso, (i + 1) % 5 → Falso}
	public void cogerTenedores(int i)
	{
		if(i >= SITIOS)
			throw new RuntimeException(new Exception("La silla " + i + " no existe"));

		mutex.enter();

		if(!this.disponible_tenedor[i] || !this.disponible_tenedor[(i + 1) % SITIOS])
		{
			ConcIO.printfnl("Esperando a comer en silla " + i);
			condTenedores[i].await();
		}

		this.disponible_tenedor[i] = false;
		this.disponible_tenedor[(i + 1) % SITIOS] = false;

		desbloquear();

		ConcIO.printfnl("Se pone a comer en silla " + i);
		// imprime_estado();

		mutex.leave();
	}

// PRE: i ≤ 4 
// CPRE: Cierto
// soltarTenedores(i)
// POST: self = self ⊕ {i → Cierto, (i + 1) % 5 → Cierto}
	public void soltarTenedores(int i)
	{
		mutex.enter();

		if(i >= SITIOS)
			throw new RuntimeException(new Exception("La silla " + i + " no existe"));

		this.disponible_tenedor[i] = true;
		this.disponible_tenedor[(i + 1) % SITIOS] = true;

		// Codigo en el cual es complejo ajustar las prioridades
		// if(condTenedores[i].waiting() > 0)
		// 	condTenedores[i].signal();
		// else
		// 	// Comensal de la derecha
		// 	if(condTenedores[(i + 1) % SITIOS].waiting() > 0 
		// 		&& this.disponible_tenedor[(i + 2) % SITIOS])
		// 		condTenedores[(i + 1) % SITIOS].signal();
		// 	else
		// 		// Comensal de la izquierda
		// 		if(condTenedores[(i + (SITIOS - 1)) % SITIOS].waiting() > 0 
		// 			&& this.disponible_tenedor[(i + (SITIOS - 1)) % SITIOS])
		// 			condTenedores[(i + (SITIOS - 1)) % SITIOS].signal();

		// Mejorando el codigo para facilitar el ajuste de prioridades
		// BoolCond misma = new BoolCond
		// 	(
		// 	true,
		// 	condTenedores[i]
		// 	);
		// BoolCond der = new BoolCond
		// 	(
		// 	this.disponible_tenedor[(i + 2) % SITIOS],
		// 	condTenedores[(i + 1) % SITIOS]
		// 	);
		// BoolCond izq = new BoolCond
		// 	(
		// 	this.disponible_tenedor[(i + (SITIOS - 1)) % SITIOS],
		// 	condTenedores[(i + (SITIOS - 1)) % SITIOS]
		// 	);

		// BoolCond condbool [] = {der, izq, misma};
		// boolean señalEnviada = false;
		// for(int j = 0; j < condbool.length && !señalEnviada; j ++)
		// {
		// 	if(condbool[j].getBool() && condbool[j].getCond().waiting() > 0)
		// 	{
		// 		condbool[j].getCond().signal();
		// 		señalEnviada = true;
		// 	}
		// }
		desbloquear();

		ConcIO.printfnl("Termina de comer en silla " + i);
		// imprime_estado();

		mutex.leave();
	}

	private void desbloquear()
	{
		boolean señalEnviada = false;

		// for(int i = 0; i < SITIOS && !señalEnviada; i ++)
		// {
		// 	if(this.disponible_tenedor[i] 
		// 		&& this.disponible_tenedor[(i + 1) % SITIOS] 
		// 		&& condTenedores[i].waiting() > 0)
		// 	{
		// 		condTenedores[i].signal();
		// 		señalEnviada = true;
		// 	}
		// }

		int max = 0;
		Monitor.Cond maxCond = null;

		for(int i = 0; i < SITIOS && !señalEnviada; i ++)
		{
			if(this.disponible_tenedor[i] 
				&& this.disponible_tenedor[(i + 1) % SITIOS] 
				&& condTenedores[i].waiting() > max)
			{
				max = condTenedores[i].waiting();
				maxCond = condTenedores[i];
			}
		}

		if(max > 0)
			maxCond.signal();
	}
}

class BoolCond
{
	private Monitor.Cond cond;
	private boolean bool;

	public BoolCond(boolean bool, Monitor.Cond cond)
	{
		this.cond = cond;
		this.bool = bool;
	}

	public Monitor.Cond getCond()
	{
		return this.cond;
	}

	public boolean getBool()
	{
		return this.bool;
	}
} 
