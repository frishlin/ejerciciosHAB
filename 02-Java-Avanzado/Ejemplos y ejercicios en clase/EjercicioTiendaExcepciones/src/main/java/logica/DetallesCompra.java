/*
Ejercicio Nº 1: Tienda Online (Excepciones)
Imagina que estás desarrollando un sistema para una tienda online que permite a los clientes realizar compras. 
Una parte importante del sistema es verificar que el cliente no introduzca datos incorrectos cuando realiza una compra. 
Necesitás implementar un programa en Java que simule este proceso y maneje las excepciones adecuadamente.
Escenario:
Cuando un cliente intenta realizar una compra, debe ingresar:
El número de tarjeta de crédito (16 dígitos).
El monto de la compra (un valor positivo).
El nombre del cliente (no puede estar vacío).
El sistema debe lanzar y manejar excepciones en los siguientes casos:
Número de tarjeta inválido: Si el número de la tarjeta no tiene 16 dígitos o contiene caracteres no numéricos, 
se debe lanzar una excepción NumberFormatException.
Monto negativo o cero: Si el monto ingresado es menor o igual a 0, se debe lanzar una excepción 
personalizada llamada MontoInvalidoException.
Nombre vacío: Si el nombre ingresado está vacío o solo contiene espacios, se debe lanzar una 
excepción IllegalArgumentException.
Requisitos:
Crear una clase personalizada MontoInvalidoException que extienda de Exception.
Utilizar bloques try-catch para capturar y manejar las excepciones lanzadas.
En el caso de capturar una excepción, mostrar un mensaje de error indicando al cliente qué ingresó incorrectamente.
Ejemplo esperado de salida de datos:
Ingrese el número de tarjeta: 12345678
Error: El número de tarjeta es inválido. Debe contener 16 dígitos.
En caso de que el valor ingresado sea inválido, se debe lanzar la excepción y volver a solicitar el valor. 
Una vez ingresado el valor correcto, no ocurre la excepción y el código debe seguir hacia el siguiente valor. 
Repetir la situación PARA CADA valor ingresado.
*/

package logica;

public class DetallesCompra {
    private int numeroTarjeta;
    private String nombreCliente;
    private double monto;
    
}
