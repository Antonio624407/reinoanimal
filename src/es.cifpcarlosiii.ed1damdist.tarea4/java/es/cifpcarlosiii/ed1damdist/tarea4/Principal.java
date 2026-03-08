package es.cifpcarlosiii.ed1damdist.tarea4;

        /**
         * Clase principal del programa.
         * Se encarga de ejecutar el programa y probar las clases del reino animal.
         */
        public class Principal {
            /*
                    Esquema de clases de reino-animal
                                      Animal
                                        |
                                        |
                                    Mamifero
                                    /       \
                                   /         \
                              Perro          Gato
                   package es.cifpcarlosiii.ed1damdist.tarea4;
                        /**
                         * Método principal donde comienza la ejecución del programa.
                         * @param args argumentos de línea de comandos
                         */
            public static void main(String[] args) {

                Animal animal = new Animal("Luffy");

                Mamifero mamifero = new Mamifero("Zoro");

                Perro toby = new Perro("Toby");

                Gato isidoro = new Gato("Isidoro");
                isidoro.setPelos(4);

                animal = isidoro;

                Gato g;
                g = (Gato) animal;
                System.out.println("pelos de gato: " + g.getPelos());

                Animal array[] = new Animal[4];

                array[0] = animal;
                array[1] = mamifero;
                array[2] = toby;
                array[3] = isidoro;

                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof Perro) {
                        System.out.println("El objeto " + i + " es un perro");

                        Perro p = (Perro) array[i];
                        p.ladrar();
                    }

                    if (array[i] instanceof Gato) {
                        System.out.println("El objeto " + i + " es un gato");

                        Gato anigato = (Gato) array[i];
                        anigato.maullar();
                    }
                }
            }
        }