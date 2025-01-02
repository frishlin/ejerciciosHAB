
package ejemplomatriz;

import java.util.Scanner;

/**
 *
 * @author Sol
 */
public class EjemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //para inicializar se pone el número de filas y el número de columnas, además del tipo de dato
        int edades[][] = new int[3][2];
        
        //asingar los datos manualmente:
        //si se intenta guardar un elemento en un índice que no existe, marca error que se llama POR DESBORDAMIENTO
        //por ejemplo: edades[0][2] = 15;
        /*
        edades[0][0] = 15;
        edades[0][1] = 20;
        edades[1][0] = 10;
        edades[1][0] = 14;
        edades[2][0] = -1;
        edades[2][2] = 2;
        */
        
        //si quiero cargar por teclado:
        Scanner teclado = new Scanner(System.in);
        
        for(int f = 0; f < edades.length; f++){
            for(int c = 0; c < edades[0].length; c++){
                System.out.println("Ingresa el valor para la fila " + f + " columna " + c);
                edades[f][c] = teclado.nextInt();
            }
        }
        
        //mostrar matriz
        
        for(int f = 0; f < edades.length; f++){
            for(int c = 0; c < edades[0].length; c++){
                System.out.print(edades[f][c] + "\t");
            }
            
            System.out.println();
            
        }
        
    }
}
