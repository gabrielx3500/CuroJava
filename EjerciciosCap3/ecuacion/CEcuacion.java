class CEcuacion{
	//El termino de mayor grado tiene exponente 3 fijo
	//Declaramos variables
	double c3, c2, c1, c0; //Coeficientes
	public void Ecuacion()
	{
       c3 = a; c2 = b; c1 = c; c0 = d;
	}
	public double ValorPara(double x)
	 {
	 	double resultado;
	 	resultado = c3*x*x*x + c2*x*x + c1*x + c0;
	 	return resultado; //devolver el valor calculado
	 	
	 }
}