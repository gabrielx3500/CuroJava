public class Matriz1{
	public static void main(String[] args){
		//Declaracion de una matriz
		int numeros[][] = new int[2][2];

		numeros[0][0] = 5;
	    numeros[1][1] = 2;
	    numeros[2][2] = 2;
	    numeros[3][1] = 5;
	    //Mostramos datos por pantalla
	    System.out.println("[" + numeros[0][0] + "]");
	    System.out.println("[" + numeros[0][1] + "]");
	    System.out.println("[" + numeros[1][0] + "]");
	    System.out.println("[" + numeros[1][1] + "]");

	}
}