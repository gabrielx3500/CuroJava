//importamos la libreria
import java.util.*;
import javax.swing.*;
/*
Calculo del area de una determinada figura. Las figuras son a)Cuadrado b)Rectangulo c)Triangulo d)Circulo
Sentencia Switch
*/

public class Areas{
	public static void main(String[] args){
     //Variables
	 Scanner leer = new Scanner(System.in);
	 //Entrada de datos por pantalla
	 System.out.print("\nElige una opcion: \n1: Cuadrado \n2 Rectangulo \n3Triangulo \n4Circulo");
	 int figura = entrada.nextInt();

	 //Operaciones 
	 switch(figura){
	 	case 1:
	 	//Area de un Cuadrado
	 	int lado = Integer.parseInt(JOptionPane.ShowInputDialog("Introduce un lado:"));
	 	//Operacion de calculo del area y mostramos datos por pantalla
	 	System.out.println("El area del Cuadrado es: " + Math.pow(lado,2));
	 	break;
	 	case 2:
	 	//Area de un Rectangulo
	 	int base = Integer.parseInt(JOptionPane.ShowInputDialog("Introduce la Base:"));
	 	int altura = Integer.parseInt(JOptionPane.ShowInputDialog("Introduce la Altura:"));
	 	//Operacion de calculo del area y mostramos datos por pantalla
	 	System.out.println("El area del Rectangulo es: " + base * altura);
	 	break;
	 	case 3:
	 	//Area de un Triangulo
	 	int base = Integer.parseInt(JOptionPane.ShowInputDialog("Introduce la Base:"));
	 	int altura = Integer.parseInt(JOptionPane.ShowInputDialog("Introduce la Altura:"));
	 	//Operacion de calculo del area y mostramos datos por pantalla
	 	System.out.println("El area del Triangulo es: " + (base * altura)/2);
	 	break;
	 	case 4:
	 	//Area de un Circulo
	 	int radio = Integer.parseInt(JOptionPane.ShowInputDialog("Introduce el Radio:"));
	 	//Operacion de calculo del area y mostramos datos por pantalla
	 	System.out.println("El area del Circulo es: " + Math.pow(radio,2));
	 	break;
    	default:
	 	 System.out.println("\nLa Opcion no es valido");
	 	 break;   
	 }//Cierre del switch
	
	 

	}
}