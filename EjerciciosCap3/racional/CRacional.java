class CRacional{
	private int Numerador;
	private int Denominador;

	public void AsignarDatos(int num, int den)
	{
		Numerador = num;
		if(den == 0) den = 1; //El denominador no puede ser 0
		Denominador = den;
	}


	public void VisualizarRacional()
	 {
	 	System.out.println(Numerador + "/" + Denominador);
	 }
}