import java.util.Array;
public class Matriz2{
	/**
 * Generar una matriz de 3×3 con números aleatorios sin repetirse.
 *
 * @author Gabriel
 */
	public static void main(String[] args){
	 //Declaramos las matrices
		int matriz[][] = new int[3][3];

		int[] numeros=generarNumerosAleatoriosSinRepetir(1, 9, matriz.length*matriz[0].length);
	 //Bucle for para rellenar una matriz
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
             matriz[i][j]=numeros[(matriz.length*i) + j];
             //Se muetsra en pantalla la matriz resultante
             System.out.print(matriz[i][j]+" ");
			}//Fin del for mas interno
            System.out.println("");
		}//Fin del Primer for
		

	}

     //Funcion para generar numeroa aleatorios que no se repitan
	public static int[] generarNumeAleatoriosSinRepetir(int minimo, int maximo, int longitud){
		//En caso de que uno sea mayotr que otro
        //Lo intercambiamos
        if(maximo<minimo){
        	int aux=maximo;
        	maximo=minimo;
        	minimo=aux;

        }

        //Si caben los numeros del rango
        //Generamos el array
               if( (maximo-minimo) >= (longitud-1) ){
         
            int numero_elementos=0;
            int numeros[]=new int[longitud];
            //RECOMENDADO: rellena el arreglo con un numero que nunca se va a generar
            Arrays.fill(numeros, minimo-1);
            boolean encontrado;
            int aleatorio;
             
            //Hasta que el numero de elementos no sea como el de la longitud del array no salimos
            while(numero_elementos<longitud){
                 
                aleatorio=generaNumeroAleatorio(minimo, maximo);
                encontrado=false;            
 
                //Buscamos si el numero existe
                for(int i=0;i<numeros.length && !encontrado;i++){
                    if(aleatorio==numeros[i]){
                        encontrado=true;
                    }
                }
                 
                //Sino lo agregamos
                if(!encontrado){
                    numeros[numero_elementos++] = aleatorio;
                }
                 
            }
             
            return numeros;

        }else{
        	System.out.println("No se puede generar el arreglo. Revisa los parametros");
        	return null;
        }

	}//Fin de la Funcion
 //Genera un numero aleatorio entre el minimo y el maximo, includo el maximo y el minimo
	public static int generaNumeroAleatorio(int minimo,int maximo){
         
        int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
    }
     
}