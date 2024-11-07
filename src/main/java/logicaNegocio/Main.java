
package logicaNegocio;

public class Main {
        public static void main(String[] args) {
        // Crear instancias de los animales
        Leon leon = new Leon();
        Delfin delfin = new Delfin();
        Perro perro = new Perro();
        
        // Mostrar información del León
        System.out.println("León:");
        System.out.println("Sonido: " + leon.emitirSonido());
        System.out.println("Dieta: " + leon.obtenerDieta());
        System.out.println("Hábitat: " + leon.getHabitat());
        System.out.println();
        
        // Mostrar información del Delfín
        System.out.println("Delfín:");
        System.out.println("Sonido: " + delfin.emitirSonido());
        System.out.println("Dieta: " + delfin.obtenerDieta());
        System.out.println("Hábitat: " + delfin.getHabitat());
        System.out.println();
        
        // Mostrar información del Perro
        System.out.println("Perro:");
        System.out.println("Sonido: " + perro.emitirSonido());
        System.out.println("Dieta: " + perro.obtenerDieta());
        System.out.println("Hábitat: " + perro.getHabitat());
        System.out.println("Interacción: " + perro.interactuarConHumano());
    }
}
