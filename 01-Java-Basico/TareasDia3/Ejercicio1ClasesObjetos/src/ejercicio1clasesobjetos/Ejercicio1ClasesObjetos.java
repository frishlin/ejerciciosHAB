/*Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
Luego, realiza las siguientes acciones:
a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?

Respuesta: se obtiene como valor NULL
*/


package ejercicio1clasesobjetos;

import logica.Electrodomestico;

public class Ejercicio1ClasesObjetos {

    public static void main(String[] args) {
       
       //electrodomésticos con parámetros 
       Electrodomestico electro1 = new Electrodomestico("marca1", "modelo1", 200.3);
       Electrodomestico electro2 = new Electrodomestico("marca2", "modelo2", 1100.3);
       Electrodomestico electro3 = new Electrodomestico("marca3", "modelo3", 220.3);
       
       //Electrdoméstico sin parámetros
       Electrodomestico electro4 = new Electrodomestico();
       
        System.out.println("Datos de los electrodomésticos: ");
        
        //mostrando electrodomésticos con parámetros
        System.out.println("Electrodoméstico 1: " + "Marca: " + electro1.getMarca() + " Consumo: " + electro1.getModelo() + electro1.getConsumoEnergetico());
        System.out.println("Electrodoméstico 2: " + "Marca: " + electro2.getMarca() + " Consumo: " + electro2.getModelo() + electro2.getConsumoEnergetico());
        System.out.println("Electrodoméstico 3: " + "Marca: " + electro3.getMarca() + " Consumo: " + electro3.getModelo() + electro3.getConsumoEnergetico());
       
        //mostrando la marca del electrodoméstico sin parámetros
        System.out.println("Electrodoméstico 4: " + electro4.getMarca());
    }
    
}
