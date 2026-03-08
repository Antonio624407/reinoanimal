package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa un animal del reino animal.
 * Contiene atributos y comportamientos básicos comunes a todos los animales.
 */
public class Animal {

    private String nombre;

    /**
     * Constructor que inicializa el nombre del animal.
     * @param nombre nombre del animal
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del animal.
     * @return nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     * @param nombre nuevo nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que representa la acción de comer.
     */
    void comer() {
        System.out.println("Necesita comer diariamente para sobrevivir");
    }

    /**
     * Método que representa la acción de dormir.
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**
     * Método que representa la reproducción del animal.
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**
     * Método que representa la relación entre animales.
     * @param a animal con el que se relaciona
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    /**
     * Devuelve una representación en texto del animal.
     * @return cadena con información del animal
     */
    @Override
    public String toString() {
        return "Animal: " + nombre;
    }
}