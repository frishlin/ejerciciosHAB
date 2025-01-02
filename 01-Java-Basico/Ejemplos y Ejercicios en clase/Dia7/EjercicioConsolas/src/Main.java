/*
Ejercicio Clases abstractas @canal
• Crear una clase abstracta llamada consola, la cual tenga los atributos:
codigo_consola, nombre, empresaDesarrollo y año de lanzamiento. Al mismo tiempo,
crear un método abstracto “cargarJuego” que indique un mensaje por pantalla que
diga “Cargando juego. Por favor espere”.
A partir de la clase abstracta creada crear las siguientes subclases hijas:
✓ Nintendo64: La cual tiene un atributo propio norma y otro para determinar si lee
cartuchos piratas. Al mismo tiempo, implementa un método propio
“leerCartucho” el cual recibirá el nombre de un juego como parámetro e indicará
un mensaje por pantalla indicando esta situación. Por ejemplo: “Leyendo
cartucho Banjo Kazooie”.
✓ PlayStation2: La cual tiene los atributos propios norma, chipeadaONo y
tamañoMemoryCard. Al mismo tiempo, implementa un método propio “leerDvd”
el cual recibirá el nombre de un juego como parámetro e indicará un mensaje
por pantalla indicando esta situación. Por ejemplo: “Leyendo DVD Fifa 2009”.
Por otro lado, también implementa un método propio llamado “grabarEnMemory”
el cual debe informar al usuario que se ha guardado correctamente un juego en
la memory card.
✓ Xbox One: La cual tiene una serie de atributos propios para manejar: Si está
conectada a internet o no, si la calidad 4K está activada y si se permite la
descarga automática de actualizaciones. Al mismo tiempo implementa un
método propio “leerJuegoDigital” el cual recibirá el nombre de un juego como
parámetro e indicará un mensaje por pantalla indicando esta situación. Por
ejemplo: “Leyendo GTA V desde tienda”.
Una vez desarrolladas cada una de las clases, se solicita desde el método Main, crear
una instancia de cada una de ellas y llamar a sus correspondientes métodos. Tener
en cuenta que todas las consolas, al heredar de una clase abstracta, deben
implementar el/los método/s de su clase madre utilizando sobreescritura de métodos (editado)
*/

//TODA CLASE COMÚN DEBE TENER CONSTRUCTORES, MÉTODOS

import logica.Nintendo64;
import logica.PlayStation2;
import logica.XboxOne;

public class Main {
    public static void main(String[] args) {
        Nintendo64 nintendo1 = new Nintendo64();
        PlayStation2 ps21 = new PlayStation2();
        XboxOne xbox1 = new XboxOne();

        //en nintendo se llamarán los métodos propios
        nintendo1.leerCartucho("Batman y Robin");
        nintendo1.cargarJuego();
        System.out.println("-----");
        ps21.LeerDvd("Fifa 2019");
        ps21.cargarJuego();
        ps21.grabarEnMemory();
        System.out.println("-----");

        xbox1.leerJuegoDigital("Halo");
        xbox1.cargarJuego();


    }
}