//importamos la libreria
import java.util.*;
/*
Dias correspondientes a un mes de un año dado
Sentencia Switch
*/

public class CDiasMes{
	public static void main(String[] args){
     //Variables
	 Scanner leer = new Scanner(System.in);
	 int dias = 0, mes = 0, ano = 0; 
	

	 //Entrada de datos por pantalla
	 System.out.print("Mes (##): ");
	 mes = leer.nextInt();
	 System.out.print("Año (####): ");
	 ano = leer.nextInt();
	

	 //Operaciones 
	 switch(mes){
	 	case 1:  //Enero
	 	case 3:  //Marzo
	 	case 5:  //Mayo
	 	case 7:  //Julio
	 	case 8:  //Agosto
	 	case 10: //Octubre
	 	case 12: //Diciembre
	 	  dias = 31;
	 	break;  
	 	case 4:  //Abril
	 	case 6:  //Junio
	 	case 9:  //Septiembre
	 	case 11:  //Noviembre
	 	   dias = 30;
	 	break;
	 	//Verificamos si Febrero es bisiesto o no  
	 	if ((ano%4 == 0)  && (ano%100 != 0) && (ano%400 == 0))
	 		dias = 29;
	 	else
	 		dias = 28;
	 	    break;
	 	default:
	 	 System.out.println("\nEl mes no es valido");
	 	 break;   
	 }
	 if (mes >= 1 && mes <= 12)
	 	 System.out.println("\nEl mes " + mes + "del año " + ano + "tiene " + dias +"dias");
	 

	}
}