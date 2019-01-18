public class EjercicioMatriz{
	 /* 1) Crear una matriz de 3×3 con los números del 1 al 9. 
    Mostrar por pantalla, tal como aparece en la matriz. */
	public static void main(String[] args){
     //Declaramos la matriz de 3x3
	 int matriz[][] = new int[3][3];
	 //i = filas y j = columnas
	 for(int i=0;i<matriz.length;i++){
	 	for(int j=0;j<matriz[0].length;j++){
	 		matriz[i][j] = (i*matriz.length) + (j+1);
            System.out.print(matriz[i][j]+" ");
	 	}//For anidado
       System.out.println("");
	 }//for primero	
	}
}