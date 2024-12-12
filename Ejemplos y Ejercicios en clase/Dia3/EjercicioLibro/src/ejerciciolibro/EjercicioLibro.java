/*
-Crear una clase llamada Libro, que tenga los siguientes atributos: codigo ISBN, título, autor, género, número de páginas.
-Construye un objeto de tipo Libro con datos ingresados por teclado por el usuario.
-Muestra por pantalla todos los datos del libro (puedes usar getters o toString)
-Modifica el numero de páginas del libro (usar el método set)
-Mostrar por pantalla los datos modificados del libro
Punto Extra OPCIONAL: Adaptar el código para que permita agregar hasta 5 libros y que CADA LIBRO se asigne a la posición de un vector.
 */
package ejerciciolibro;

import java.util.Scanner;
import logica.Libro;


public class EjercicioLibro { 
    
    public static void main(String[] args) {
        //Libro libro = new Libro();
        
        Libro libros[] = new Libro[5];
        
        
        Scanner teclado = new Scanner(System.in);
        Libro libro1 = new Libro();    
        for(int i = 0; i < libros.length; i++){
            
            System.out.println("Ingresa los datos del libro " + (i+1) + ": ");
            
            //Libro libro1 = new Libro();  evita crear más memoria
            
            System.out.print("Ingresa el ISBN: ");
            libro1.setISBN(teclado.nextLine());

            System.out.print("Ingresa el título: ");
            libro1.setTitulo(teclado.nextLine());

            System.out.print("Ingresa el autor: ");
            libro1.setAutor(teclado.nextLine());

            System.out.print("Ingresa el género: ");
            libro1.setGenero(teclado.nextLine());

            System.out.print("Ingresa el número de páginas: ");
            teclado = new Scanner(System.in);
            libro1.setNumeroPaginas(teclado.nextInt());
            
            //System.out.println(libro1.toString());
            
            libros[i] = libro1;
            //System.out.println(libro1);
            libro1 = new Libro(); //resetea el libro
            teclado = new Scanner(System.in);
        }
        
        
        
        for(int i = 0; i < libros.length; i++) {
            System.out.println("Libro " + (i+1) + ": ");
            System.out.println(libros[i].toString());
        }
        
        //MODIFICANDO AUTOR DEL LIBRO 4 Y EL NÚMERO DE PÁGINAS DEL LIBRO 1
        libros[3].setAutor("Pancho");
        libros[0].setNumeroPaginas(40);
        
        System.out.println("DESPUÉS");
        for(int i = 0; i < libros.length; i++) {
            System.out.println("Libro " + (i+1) + ": ");
            System.out.println(libros[i].toString());
        }
    }
    
}
