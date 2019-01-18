import java.util.*;
public class VectoresDinamicos{
	public static void main(String[] args){
		//Declaramos las variables
		int longitud = 0;
		Scanner entrada = new Scanner(System.in);
		//Solicitamos datos por pantalla
		System.out.print("¿Cuantos numeros deseas ingresar? ");
		longitud = entrada.nextInt();

		//Declaramos el vector o matriz unidimensional
		int numeros[] = new int[longitud];

		//Bucle for para recorrer el arreglo
		for(int i=0; i < numeros.length; i++)
		{
          System.out.print("Por favor dame el valor #: " + (i+1));
          numeros[i] = entrada.nextInt();
		}//Fin del bucle for
		//Segundo Bucle for para recorrer el arreglo
		for(int i=0; i < numeros.length; i++)
		{
          System.out.print("[" + numeros[i] + "]");
         
		}//Fin del bucle for

	}
}