public class Matriz{
	/* Crear un programa que muestre en pantalla una matriz de 2 Filas y 2 Columnas
	con un numero dentro de cada posicion*/
	public static void main(String[] args)
	{
     //Declaracion de matrices
	int numeros[][] = new int[2][2];

	numeros[0][0] = 5;
	numeros[0][1] = 2;
	numeros[1][0] = 2;
	numeros[1][1] = 5;

	//Mostramos datos por pantalla
	System.out.print("[" + numeros[0][0] + "]");
	System.out.print("[" + numeros[0][1] + "]");
	System.out.print("[" + numeros[1][0] + "]");
	System.out.print("[" + numeros[1][1] + "]");
	}
}