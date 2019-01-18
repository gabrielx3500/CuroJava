import java.util.Scanner;

public class MatrizDeNumeros
{
    public static void main(String[] args)
    {
        char opcion;
        int i, j;
        int[][] numeros = new int[3][5];

        Scanner teclado = new Scanner(System.in);

        do
        {
            System.out.printf("\n>>> MENÚ DE OPCIONES <<<");
            System.out.printf("\n1. Mostrar números de la matriz.");
            System.out.printf("\n2. Asignar números aleatorios a la matriz.");
            System.out.printf("\n3. Inicializar la matriz a ceros.");
            System.out.printf("\n4. Salir.");

            do
            {
                System.out.printf("\nIntroduzca opción (1-4): ");
                opcion = teclado.next().charAt(0);
            }
            while(opcion < '1' || opcion > '4');

            System.out.printf("\n");

            switch(opcion)
            {
                case '1': for(i=0; i<3; i++)
                          {
                              for(j=0; j<5; j++)
                              {
                                  System.out.print(numeros[i][j]);
                              }
                              System.out.printf("\n");
                          }
                          break;
                case '2': for(i=0; i<3; i++)
                          {
                              for(j=0; j<5; j++)
                              {
                                  numeros[i][j]= (int) (Math.random()*10);
                              }
                          }
                          System.out.printf("Números aleatorios asignados.\n");
                          break;
                case '3': for(i=0; i<3; i++)
                          {
                              for(j=0; j<5; j++)
                              {
                                  numeros[i][j]=0;
                              }
                          }
                          System.out.printf("Matriz inicializada a ceros.\n");

            }
        }
        while(opcion != '4');
    }
}