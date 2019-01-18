public class EvaluaExpresion{
	/*
      Evalua la expresion x = (a - b++) * (--c - d)/2
	*/
	public static void main(String[] args){
		//Variables
		float x = 0, a = 15, b = 5, c = 11, d = 4;
		//Operaciones
		x = (a - b++) * (--c - d)/2;
		//Mostramos resultados por pantalla
		System.out.println(x);
		System.out.println(b);
        System.out.println(c);

	}
}