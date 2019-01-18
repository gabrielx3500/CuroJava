
public class Testtry{
	/*
       Ejermplo del try catch
	*/

	public static void main(String[] args){
		//Variables
		int dato1 = 0, dato2 = 0, dato3;

		System.out.println("Se inicia la aplicacion");
		try {
   
        dato1++;
		dato3 = dato1 / dato2;
		dato2++;
		

		}
		catch(ArithmeticException e)
		{
           //manejar una exception del tipo ArithmeticException
			System.out.println("Error: " + e.getMessage());
			dato3 = dato1;
		}
		System.out.println(dato1 + " " + dato2 + " " + dato3);

	}
}