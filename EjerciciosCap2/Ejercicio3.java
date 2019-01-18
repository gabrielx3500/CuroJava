public class Ejercicio3{
	/*
    Escriba una aplicacion para calcular el valor
    devuelto por la expresion b2 - 4ac/2a

	// Metodo

    */

    public static double calculo(double x, double y, double z){
        //Declaracion de variables
        double resultado = 0;
        resultado = (x*x - 4*y*z)/2*y;
        return resultado;
    }
      
	public static void main(String[] args){
    //Declaracion de variables
       double a = 1, b = 5, c = 2, r = 0;

    //Operaciones
       r = calculo(b,a,c);
    
    //Mostramos resultados por pantalla
		System.out.println(r);
   
	}
}