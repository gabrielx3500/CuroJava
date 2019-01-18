public class CMetodos{
	/*
    Metodo Sumar:
      parametros x e y de tipo double
      devuelve x + y

	*/
      //Metodo
    public static double sumar(double x, double y){
       //Declaracion de variables
       double resultado = 0;
       resultado = x + y;
       return resultado;	

    }  
	public static void main(String[] args){
       //Decloaracion de variables
		double a = 10, b = 20, r = 0;
		r = sumar(a,b);
		System.out.println("Suma = " + r);

	}
}