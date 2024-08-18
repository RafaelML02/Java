package aed.urgencias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

  @Test
  public void testAdmitir() throws PacienteExisteException
  {
    Urgencias u = new UrgenciasAED();
    u.admitirPaciente("111", 5, 1);
    Paciente p = u.atenderPaciente(10);

    // Check expected DNI ("111") == observed DNI (p.getDNI())
    assertEquals("111", p.getDNI());
  }
  
  @Test
  public void test1() throws PacienteExisteException{
	  Urgencias u = new UrgenciasAED();
	  u.admitirPaciente("111", 0, 1);
	  u.admitirPaciente("222", 0, 2);
	  Paciente p = u.atenderPaciente(5);
	  
	  assertEquals("111", p.getDNI());
  }
  
  @Test
  public void test2() throws PacienteExisteException{
	  Urgencias u = new UrgenciasAED();
	  u.admitirPaciente("111", 0, 1);
	  u.admitirPaciente("222", 0, 2);
	  Paciente p1 = u.atenderPaciente(5);
	  assertEquals("111", p1.getDNI());
	  
	  Paciente p2 = u.atenderPaciente(5);
	  assertEquals("222", p2.getDNI());

  }
  
  
  @Test
  public void test3() throws PacienteExisteException{
	  Urgencias u = new UrgenciasAED();
	  u.admitirPaciente("111", 5, 1);
	  u.admitirPaciente("222", 1, 2);
	  Paciente p = u.atenderPaciente(5);
	  
	  assertEquals("222", p.getDNI());
  }
  
  
  @Test
  public void test4() throws PacienteExisteException, PacienteNoExisteException{
	  Urgencias u = new UrgenciasAED();
	  u.admitirPaciente("111", 0, 1);
	  u.admitirPaciente("222", 0, 2);
	  u.salirPaciente("111", 5);
	  Paciente p2 = u.atenderPaciente(10);
	  
	  assertEquals("222", p2.getDNI());
  }
  
  
  @Test
  public void test5() throws PacienteExisteException, PacienteNoExisteException{
	  Urgencias u = new UrgenciasAED();
	  u.admitirPaciente("111", 5, 1);
	  u.admitirPaciente("222", 5, 2);
	  u.cambiarPrioridad("222", 1, 5);
	  Paciente p2 = u.atenderPaciente(10);
	  
	  assertEquals("222", p2.getDNI());
  }
  
  
  
  
}

