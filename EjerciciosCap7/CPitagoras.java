
public class CPitagoras{
	//calculo de Teorema de Pitagoras
	public static void main(String[] args){
	 //Variables
	int x = 1, y = 1, z = 1;
	System.out.println("Z\t" + "X\t" + "Y");
	System.out.println("______________________");

	//Bucle While
	while(x <= 50)
	{
	 //Calcular Z. Como Z es un entero, almacena
	 //la parte entera de la raiz cuadrada
	 z = (int)Math.sqrt(x*x + y*y)
	 while(y<=50 && z<=50)
	 {
	 	if(z*z==x*x+y*y)
        System.out.println(z + "\t" + x + "\t" + y);
    y = y + 1;
    z = (int)Math.sqrt(x*x+y*y);
	 }	
	 x = x + 1; y = x;
	}	
	}
}