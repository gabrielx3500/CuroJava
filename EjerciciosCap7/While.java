
public class While {
	/*
      Ejemplo del Bucle While

	*/

public static void main(String[] args){
  //Variable
  char car = '\0';
  try
     {
     	System.out.print("\nDesea continuar s/n (Si o No)");
     	car = (char)System.in.read();
     	//Saltar los caracteres disponibles en el flujo d enetrada
     	System.in.skip(System.in);
     	while (car!= 's' && car!='n')
     	{
     	  System.out.print("\nDesea continuar s/n (Si o No)");
     	  car = (char)System.in.read();
     	  System.in.skip(System.in);
     	}
     }	
     catch (IOException ignorada){}
	}
}