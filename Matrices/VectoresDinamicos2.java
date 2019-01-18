import java.util.*;

public class VectoresDinamicos2{
	public static void main(String[] args){
	 //Declaramos una variable
	 int longitud = 0;
	 Scanner entrada = new Scanner(System.in);
	 
	 //Pedimos los datos al usuario
	 System.out.println("¿Cuantos numeros desea introducir?");
	 longitud = entrada.nextInt();
	 //Declaramos el vector
	 int numeros[] = new int[longitud];

	 //Bucle for para introducir los datos
	 for(int i = 0; i< numeros.length; i++){
       System.out.print("Introduce el numero #" + (i+1)+":");
       numeros[i] = entrada.nextInt();
	 }	//Fin del bucle for
	    //Segundo Bucle for para recorrer el arreglo
	 for(int i = 0; i< numeros.length; i++){
	 	System.out.print("[" + numeros[i] + "]");
	 }//Bucle for
	}

}