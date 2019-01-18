import java.util.*;
/* 2) Crear una matriz de 5 filas y n columnas (se pide al usuario). 
 Rellenarlo con números aleatorios entre 0 y 10. */
public class NumAleatorio{



	public static void main(String[] args){
		//Declaracion de variables
	 int filas = 0, columnas = 0;
     Scanner entrada = new Scanner(System.in);

     //Solicitamos datos al usuario
     System.out.println("¿Cuantas Columnas quieres?");
     columnas = entrada.nextInt();
     //Declaramos la matriz
     int matriz[][] = new int[5][columnas];
     //Bucle for para recorrer la matriz
          for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]=generaNumAleatorio(0,10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
     }
	}

public static int generaNumAleatorio(int minimo, int maximo){
    	return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }

   } 