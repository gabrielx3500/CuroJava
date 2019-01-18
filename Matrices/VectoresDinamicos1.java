import java.util.*;
public class VectoresDinamicos1{
	public static void main(String[] args){
		//Declaramos las variables
		int longitud = 0;
		Scanner entrada = new Scanner(System.in);
		//Solicitamos datos por pantalla
		System.out.println("¿Cuantos numeros deseas ingresar");
		longitud = entrada.nextInt();

		//Declaramos el vector
		int numeros[] = new int[longitud];

		//Bucle para recorrer el vector
		//Este bucle me permitira llenar automaticamente
		//cada posicion del vector
		for (int i = 0; i< numeros.length; i++)
		{
          System.out.print("Escribe el numero #" + (i+1)+":");
          numeros[i] = entrada.nextInt();
		}//Fin del bucle 1
        //Segundo bucle parac mostra datos por pantalla
		for (int i = 0; i< numeros.length; i++)
		{
          System.out.print("[" + numeros[i] + "]");
          
		}//Fin del bucle 2
		


	}
}