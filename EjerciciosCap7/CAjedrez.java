import java.util.*;
public class CAjedrez{
	/*
       Imprime un tablero de ajedrez
	*/

	public static void main(String[] args){
		//Variables
		Scanner leer = new Scanner(System.in);
		int falfil, calfil; //Posicion inicial del alfil
		int fila, columna; //Posicion actual del alfil

		//Peticion de datos
		System.out.println("Posicion inicial del Alfil: ");
		System.out.print(" Fila   ");
		falfil = leer.nextInt();
		System.out.print(" Columna   ");
		calfil = leer.nextInt();
		System.out.println(); //Dejar una linea en blanco

		//Pintar el tablero de Ajedrez
		for(fila = 1; fila <=8; fila++)
		{
			for(columna = 1; columna<=8; columna++)
			 {
			 	if((fila + columna == falfil + calfil) ||
			 	  (fila - columna == falfil - calfil))
			 	   System.out.print("* ");
			 	else if ((fila + columna) % 2 == 0)	
			 	   System.out.print("B ");
			 	else
			 		System.out.print("N ");

			 		
			 }	//se cierra el for mas interno
			 System.out.println(); //Cambiar de Fila
		}

	}
}