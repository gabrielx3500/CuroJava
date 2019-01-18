class CCuentaAhorro extends CCuenta{
	/*
	//Atributos
	private double CuotaMantenimiento;
	//Metodos
	public CCuentaAhorro(){}//Constructor sin parametros
	public CCuentaAhorro(String nom, String cue, double sal, double tipo, double mant)
	{
		super(nom, cue, sal, tipo); //Invoca al contructor CCuenta,
		                            //esto es al de la clase base
		                           
		asignarCuotaManten(mant);   //inicia cuotaMantenimiento
	}

	public void asignarCuotaManten(double cantidad){
	  if(cantidad<0)
	  {
	  	System.out.println("Error:cantidad negativa");
	  	return;
	  }	
	  cuotaMantenimiento = cantidad;
	}

	public double obtenerCuotaManten(){
		return cuotaMantenimiento;
	}

	public void reintegro(){
		double saldo = estado();
		double tipoDeInteres = obtenerTipoDeInteres();
		if(tipoDeInteres >=3.5)
		{
			if(saldo - cantidad < 1500)
			{
				System.out.println("error: no dispone de esa cantidad");
			}
			return;
		}

	}
	super.reintegro(cantidad); //metodo de reintegro d el aclase base
}
*/
}