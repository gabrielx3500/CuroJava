import java.util.*;
public class MatrizDinamica{
	
	public static void main(String[] args)
	{
	 //Declaracion e variables
	 int filas = 0, columnas = 0, contador = 1;
	 Scanner entrada = new Scanner(System.in);

	 //Peticion de datos por pantalla
	 System.out.println("¿Cuantas Filas deseas?");
	 filas = entrada.nextInt();
	 System.out.println("¿Cuantas Columnas deseas?");
	 columnas = entrada.nextInt();
     //Declaracion de matrices
	int numeros[][] = new int[filas][columnas];

	//Bucle for
	for(int j = 0; j < filas; j++){
	 for(int i = 0; i< columnas; i++){
	 	numeros[j][i] = contador;
	 	contador++;
	 	System.out.print("[" + numeros[j][i] + "]");
	 }	
	 System.out.println("");
	}

	
	}
}