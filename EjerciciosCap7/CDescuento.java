//importamos la libreria
import java.util.*;
/*


*/

public class CDescuento{
	public static void main(String[] args){
     //Variables
	 Scanner leer = new Scanner(System.in);
	 int ar, cc; //codigo y cantidad
	 float pu; //Precio unitario
	 float desc; //Descuento

	 //Entrada de datos por pantalla
	 System.out.print("Codigo articulo ....... ");
	 ar = leer.nextInt();
	 System.out.print("Cantidad comprada ....... ");
	 cc = leer.nextInt();
	 System.out.print("Precio unitario ....... ");
	 pu = leer.nextInt();
	 System.out.println();

	 //Operaciones 
	 if(cc > 100)
	 	desc = 40F; //Descuento de 40%
	 else if(cc >=25)
	 	desc = 25F; //Descuento de 25%
	 else if(cc >=10)
	 	desc = 10F; //Descuento del 10%
	 else
	 	desc = 0; //Descuento del 0%
	 //mostrar datos por pantalla
	 System.out.println("Descuento ........................ " + desc + "%");
	 //Calculamos el descuento en cada compra
	 System.out.println("Total     ........................ " + cc * pu * (1 - desc / 100));
	 //Otra manera de presentar los datos con la funcion para redondear
	 //System.out.println("Total     ........................ " + Math.round(cc * pu * (1 - desc / 100)));



	}
}