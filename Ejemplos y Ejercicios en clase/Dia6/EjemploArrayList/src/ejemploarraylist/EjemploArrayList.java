/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarraylist;

import java.util.ArrayList;
import logica.Fruta;

/**
 *
 * @author Sol
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();
        Fruta fruta = new Fruta("manzana", "rojo", "todo el año");
        //agregar a la lista
        listaFrutas.add(fruta);
        listaFrutas.add(new Fruta ("banana", "amarillo", "todo el año"));
        listaFrutas.add(new Fruta ("naranja", "anaranjado", "todo el año"));
        
    }
    
}
