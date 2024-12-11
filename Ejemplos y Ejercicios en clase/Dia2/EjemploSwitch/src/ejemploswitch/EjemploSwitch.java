
package ejemploswitch;

import java.util.Scanner;

public class EjemploSwitch {

    
    public static void main(String[] args) {
        
        //Pida un número del 1 al 7 para saber qué día de la semana es
        
        System.out.println("Ingresa un número y te diré qué día es: ");
        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt();
        
        switch(dia){
            
            
            
            case 1: System.out.println("El día es Lunes");
            break;
            
            case 2: System.out.println("El día es Martes");
            break;
            
            case 3: System.out.println("El día es Miércoles");
            break;
            
            case 4: System.out.println("El día es Jueves");
            break;
                      
            case 5: System.out.println("El día es Viernes");
            break;
            
            case 6: System.out.println("El día es  Sábado");
            break;
            
            case 7: System.out.println("El día es Domingo");
            break;
            
            default: System.out.println("No existe un día de la semana para ese número.");
            break; //como buena práctica, debería estar el break
        }
    }
    
}
