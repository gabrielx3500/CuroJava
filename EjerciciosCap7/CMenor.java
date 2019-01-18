//importamos la libreria
import java.util.*;

public class CMenor{
	//El menor de tres numeros
	public static void main(String[] args){
		//Variables
		Scanner leer = new Scanner(System.in);
		float a,b,c,menor;

		//Leer los valores de a,b,c
		System.out.println("a : "); 
		a = leer.nextFloat();
		System.out.println("b : ");
		b = leer.nextFloat();
		System.out.println("c : ");
		c = leer.nextFloat();
		//Operaciones de comparacion
		if (a < b)
		  if(a < c)
		     menor = a;
		else
		     menor = c;
		else
		   if (b < c)
		      menor = b;
		else
		     menor = c;
		//Mostramos resultados por pantalla
		System.out.println("Menor = " + menor);                 



	}
}