package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa un gato.
 * Hereda de la clase Mamifero.
 */
public class Gato extends Mamifero {

    private int pelos;

    /**
     * Constructor de la clase Gato.
     * @param nombre nombre del gato
     */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Devuelve el número de pelos del gato.
     * @return cantidad de pelos
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * Establece el número de pelos del gato.
     * @param pelos número de pelos
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    /**
     * Método que describe cómo duerme el gato.
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Método que representa el maullido del gato.
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Método que representa la relación con otro animal.
     * @param p animal con el que se relaciona
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }
}