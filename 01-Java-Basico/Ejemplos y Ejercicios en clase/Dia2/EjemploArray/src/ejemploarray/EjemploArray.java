
package ejemploarray;

import java.util.Scanner;

public class EjemploArray {

    //índice inicia en 0 - es el número que identifica a un elemento
    //posición inicia en 1
    public static void main(String[] args) {
        //Primero la fila y luego la columna
        
        /*
                0   1   2    Para acceder al 35 debería ser: 0,1
              -----+---+----
            0|  14  35  23   
            1|  10  5   96
            2|   8  2   91
        
        */
    
        //vectores o arreglos unidimensionales
        
        //tipo de dato  -  nombre - dos formas de declarar [] corchetes al final y la otra forma es los [] al principio al lado del tipo de dato
        
        //declaración de un vector
        //int numeros[];
        //para indicar cuántas posiciones tendrá, se hace a través de la palabra 'new' y las posiciones
        int numeros[] = new int[5];
        
        //cargar manualmente
        //esto se llama 'hardcodear' - ingresar nosotros mismos los valores
        /*
        numeros[0] = 32;
        numeros[1] = 12;
        numeros[2] = 25;    
        numeros[3] = 75;
        numeros[4] = 890;
        */
        //carga meidante teclado:
        System.out.println("Ingresa los números a guardar");
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            numeros[i] = teclado.nextInt();
            
        }
        
        //Para recorrer se hace de la misma manera
        
        for(int i = 0; i < 5; i++){
            System.out.println("El valor guardado en el índice " + i + " es: " + numeros[i]);
        }
    }
    
}
