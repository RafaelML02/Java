package lab9.enun.hora_comprob;

class ParametroNoValido extends Exception
{
  ParametroNoValido () 
  {
  }
  ParametroNoValido (String msj) 
  {
    super(msj);
  }
}