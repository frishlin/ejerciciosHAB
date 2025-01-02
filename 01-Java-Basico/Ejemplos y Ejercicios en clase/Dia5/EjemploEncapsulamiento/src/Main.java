import logica.Mascota;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mascota masco = new Mascota(); //creando mascota vacía, sin atributos
        //acceder al nombre de la mascota
        masco.setNombre("Síkis");
        masco.getNombre(); //funciona porque es público

        String nombre = masco.getNombre(); //
        System.out.println(nombre);


    }
}