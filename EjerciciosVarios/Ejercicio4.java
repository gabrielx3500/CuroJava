//Importamos la libreria
import java.util.*;
public class Ejercicio4{
	/*
	  Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. 
	  Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
	  Hacer un programa que calcule e imprima la cantidad de dinero que poseen cada uno.
	*/
	public static void main(String[] args ){
	  //Variables
	  Scanner entrada = new Scanner(System.in);
	  float guillermo, luis, juan,total;
	  //Introdducion de datos
	  System.out.println("Escribe la cantidad de dinero que poseen cada uno");
      //Cantidad de dinero que tiene Guillermo
      guillermo = entrada.nextFloat();
      luis = guillermo/2;
      juan = (guillermo + luis)/2;
      //Total
      total = guillermo + luis + juan;
      //Mostramos los resultados por pantalla
      System.out.println("\nLa cantidad de dinero que tiene cada uno es: " +
       "Guillermo tiene: "+ guillermo + " Dolares" + "Juan tiene:"+ juan + " Dolares" + " Luis tiene:" 
       + luis + "Dolares");
       System.out.println("\nLa cantidad de dinero total que poseen entre los tres es: " + total);


	}
}