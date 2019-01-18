import java.util.*;
 
public class SumMatrices {
    /* Crear dos matrices de nxn y sumar sus valores, 
    los resultados se deben almacenar en otra matriz. 
    Los valores y la longitud, seran insertados por el usuario. 
    Mostrar las matrices originales y el resultado.*/
 
    public static void main(String[] args) {
        //Variable
        int tamanio = 0;
        Scanner entrada = new Scanner(System.in);

        //Pedimos datos al usuario
        System.out.println("¿Cuantas Filas y Columnas deseas?"); 
        tamanio = entrada.nextInt();

        //Declaramos la matriz A
        int matriz1[][] = new int[tamanio][tamanio];
        //Declaramos la matriz B
        int matriz2[][]= new int[tamanio][tamanio];
        //Declaramos la matriz que sera el resultado de la Suma de A + B
        int resultado[][] = new int[tamanio][tamanio];

        //Bucle for para recorrer la matriz
        for(int i = 0; i<matriz1.length;i++){
            for(int j= 0; j<matriz1[0].length; j++){
              //Solicitamos al Usuario que introduzca 
              //el tamaño de la Matriz 1
              System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1");
              matriz1[i][j] = entrada.nextInt(); 
              //Solicitamos al Usuario que introduzca 
              //el tamaño de la Matriz 2
              System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 2");
              matriz2[i][j] = entrada.nextInt(); 
              //Matriz resultado producto de la suma de las matrices A y B
              resultado[i][j] = matriz1[i][j]+matriz2[i][j];
            }
        }//Cerramos los bucles for

        System.out.println("Matriz 1");
        muestraMatriz(matriz1);

        System.out.println("Matriz 2");
        muestraMatriz(matriz2);

        System.out.println("Matriz Resultante");
        muestraMatriz(resultado);
  }
        public static void muestraMatriz(int[][] matriz){
            for(int i = 0; i<matriz.length;i++){
              for(int j = 0; j<matriz.length;j++){
                 System.out.print(matriz[i][j]+" ");
              }
               System.out.println("");
            }

        


    }   
}    