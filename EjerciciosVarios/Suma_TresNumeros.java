//Importamos la libreria
import java.util.*;

public class Suma_TresNumeros{
	/*
      Este es un programa que calcula la Suma de Tres Numeros
	*/
	public static void main(String[] args){
		//Variables
		Scanner entrada = new Scanner(System.in);
		float nota1, nota2, nota3;
		float suma = 0;
		//Entrada de datos
		System.out.println("Escribe las notas para calcular la suma");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		//Operaciones
		suma = nota1 + nota2 + nota3;
		//Mostramos resultados por pantalla
		System.out.println("\n");
		System.out.println("\nLa Suma de los tres numeros es: " + suma);
		

	}
}