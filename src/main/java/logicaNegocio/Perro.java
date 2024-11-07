package logicaNegocio;

public class Perro extends Animal implements Domestico {

    private final TipoHabitat habitat;
    public Perro() {
        this.habitat = TipoHabitat.TERRESTRE;
    }
    
    @Override
    public String emitirSonido() {
        return "Ladrido";
    }
    
    @Override
    public String obtenerDieta() {
        return "Omnívoro";
    }
    
    @Override
    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }
}
