/*Lista enlazada de frutas*/
package ejemplolinkedlist;

import java.util.LinkedList;

/**
 *
 * @author Sol
 */
public class EjemploLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> listaFrutas = new LinkedList<String>(); //sin especificar el tipo de dato o agregando el tipo de dato
        
        /*
        JAVA agrega elementos en el orden que se especifique
        LIFO y FIFO
        LIFO Last In First Out
        FIFO First in First Out
        */
        //agregar una naranja con .add
        listaFrutas.add("naranja");
        listaFrutas.add("manzana");
        listaFrutas.add("pera");
        listaFrutas.add("plátano");
        listaFrutas.add("guayaba");
        
        listaFrutas.add(0, "Melón");
        
        int tamanio = listaFrutas.size();
        System.out.println("El tamaño de la lista es: " + tamanio);
        
        for(String fruta : listaFrutas){
            System.out.println("La fruta guardada es: " + fruta);
        }
        
        //eliminar un elemento
        listaFrutas.remove(0);
        System.out.println("--- con remove ---");
        for(String fruta : listaFrutas){
            System.out.println("La fruta guardada es: " + fruta);
        }
    }
     
}
