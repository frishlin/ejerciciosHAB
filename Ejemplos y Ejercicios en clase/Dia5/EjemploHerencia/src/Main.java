import logica.Gato;
import logica.Perro;

public class Main {
    public static void main(String[] args) {
        //creando objeto de tipo Perro
        Perro perro = new Perro("Dorian", 6, "gris con blanco", 0);
        Gato gato = new Gato("Lito", 7, "gris con blanco", 2);

        perro.comer();
        gato.comer();

        //perro.maullar(); no se pueden comunicar ni tener los mismos métodos
        perro.ladrar(); //método propio de Perro
        gato.maullar(); //método propio de Gato
    }
}