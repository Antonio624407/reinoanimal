package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa un perro.
 * Hereda de la clase Mamifero.
 */
public class Perro extends Mamifero {

    /**
     * Constructor de la clase Perro.
     * @param nombre nombre del perro
     */
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Método que describe cómo duerme el perro.
     */
    @Override
    void dormir() {
        System.out.println("El perro duerme varias horas al día");
    }

    /**
     * Método que representa el ladrido del perro.
     */
    void ladrar() {
        System.out.println("Es lo que hacen los perros");
    }

    /**
     * Método que representa la relación con otro animal.
     * @param p animal con el que se relaciona
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }
}