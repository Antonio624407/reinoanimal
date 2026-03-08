package es.cifpcarlosiii.ed1damdist.tarea4;

public class Perro extends Mamifero {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    void dormir() {
        System.out.println("El perro duerme varias horas al día");
    }

    void ladrar() {
        System.out.println("Es lo que hacen los perros");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }
}