package Singleton;

    public class Singleton {
        private static Singleton instance;
        private Singleton() {
            // Constructor privado para evitar la creación de instancias desde fuera de la clase
        }
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

