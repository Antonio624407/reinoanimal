package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa un mamífero.
 * Hereda de la clase Animal.
 */
public class Mamifero extends Animal {

    /**
     * Constructor de la clase Mamifero.
     * @param nombre nombre del mamífero
     */
    public Mamifero(String nombre) {
        super(nombre);
    }

    /**
     * Método que describe la reproducción de los mamíferos.
     */
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /**
     * Método que representa la relación entre mamíferos.
     * @param m animal con el que se relaciona
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}