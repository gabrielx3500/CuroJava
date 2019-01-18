import java.util.Scanner;
 
/**
 * Ejercicio 4 de matrices
 *
 * @author Discoduroderoer
 */
public class UnoMas{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		//Declaracion de Variables
		boolean salir = false;
		int opcion = 0;
		//Creacion del Menu
		do {
          //Mensajes del menu
          System.out.println("Menu");
          System.out.println("1. Sumar");
          System.out.println("2. Restar");
          System.out.println("3. Multiplicar");
          System.out.println("4. Dividir");
          System.out.println("5. Salir");
          System.out.println("Elije una opcion");
          opcion = entrada.nextInt();
        switch(opcion){

        	case 1:
        	int resultado = 1+2;
        	System.out.println(resultado);
        	  break;
        	case 2:
        	resultado = 2-1;
        	System.out.println(resultado);
        	  break;
        	case 3:
        	resultado = 1*2;
        	System.out.println(resultado);
        	  break;
        	case 4:
        	resultado = 2/1;
        	System.out.println(resultado);
        	  break; 
        	default:
        	System.out.println("Tienes que meter un valor entre 1 y 7");       
        }
      }while(!salir);
      System.out.println("FIN");
	}
}