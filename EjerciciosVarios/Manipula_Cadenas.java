public class Manipula_Cadenas{
	public static void main(String[] args){
		//Variables
		String nombre = "Gabriel";
		//Mostramos resultados por pantalla
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi nombre tiene: " + nombre.length() + "  letras");
		System.out.println("La primera letra de " + nombre + "es: " + nombre.charAt(0));
		//Calculo de el ultima letra de una cadena de caracteres
		int ultima_letra;
		ultima_letra = nombre.length();
		//Mostramos resultados por pantalla
		System.out.println("La ultima letra es la: " + nombre.charAt(ultima_letra-1));




	}
}