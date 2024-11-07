package logicaNegocio;


public class Delfin extends Animal {
    public Delfin() {
        this.habitat = TipoHabitat.ACUATICO;
    }
    
    @Override
    public String emitirSonido() {
        return "Chirrido";
    }
    
    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
}
