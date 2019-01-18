class CCuenta{
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoDeInteres;
	//Metodos
	public void asignarNombre(String nom){
		if(nom.length()==0){
			System.out.println("Error: cadena vacia");
			return;
		}
        nombre = nom;
	}//Fin del metodo asignarNombre

	public String obtenerNombre(){
		return nombre;
	}

	public void asignarCuenta(String cue){
      if (cue.length()==0){
      	System.out.println("Error: cuenta no valida");
		return;
      }
      cuenta = cue;
	}

	public String obtenerCuenta(){
	  return cuenta;
	}

	public double estado(){
	  return saldo;
	}

	public void ingreso(double cantidad){
      if(cantidad<0){
      	System.out.println("Error: cantidad no valida");
		return;
      }
      saldo = saldo + cantidad;
	}

	public void reintegro(double cantidad){
      if(saldo-cantidad<0){
      	System.out.println("Error: no dispone de saldo");
		return;
      }
      saldo = saldo - cantidad;
	}

	public void asignarTipoDeInteres(double tipo){
		if(tipo<0){
		System.out.println("Error: Tipo no valido");
		return;	
		}
		tipoDeInteres = tipo;
	}
	public void obtenerTipoDeInteres(double tipo){
		if(tipo<0){
		System.out.println("Error: Tipo no valido");
		return;	
		}
		tipoDeInteres = tipo;
	}
	public double obtenerTipoDeInteres(){
		return tipoDeInteres;
	}


}