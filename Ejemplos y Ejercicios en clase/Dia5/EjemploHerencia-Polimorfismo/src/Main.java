import logica.Animal;
import logica.Gato;
import logica.Perro;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal();
        animal = new Perro();
        animal = new Gato();

        //se puede asignar un hijo a la clase madre, pero no la madre al hijo
        //animal = perro;

        //No solo se cumple con objeto, sino también con Arrays
        /*
        Cuando se tienen clases que heredan de otras, se pueden crear objetos o estructuras de la clase madre y asignar adentro objetos hijos
        aunque no sean iguales entre sí.
        */
        /*Animal listaAnimales[] = new Animal[3];
        listaAnimales[0] = new Perro("Golda", 4, "negro con blanco", 1);
        listaAnimales[1] = new Gato("Síkis", 10, "negro", 0);*/

        //Mandando llamar al método comer de ambos objetos
        //creando objeto de tipo Perro y Gato
        Perro perro = new Perro("Dorian", 6, "gris con blanco", 0);
        Gato gato = new Gato("Lito", 7, "gris con blanco", 2);

        /*perro.comer("huesos");
        gato.comer("pescado");*/

        //creando un objeto animal
        //Animal animal = perro;  -- ya se creó en la línea 9
        //animal = perro;
        //animal.comer(); si no se asigna el animal (perro o gato), da "null está comiendo"

        /*
        perro.comer();
        gato.comer();

        //perro.maullar(); no se pueden comunicar ni tener los mismos métodos
        perro.ladrar(); //método propio de Perro
        gato.maullar(); //método propio de Gato
        */



    }
}