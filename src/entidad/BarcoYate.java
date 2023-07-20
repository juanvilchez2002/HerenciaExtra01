
package entidad;


public class BarcoYate extends BarcoMotor {
    protected int nroCamarote;

    public BarcoYate() {
    }

    public BarcoYate(int nroCamarote, int potenciaMotor, String matricula, int eslora, int anioFabricacion) {
        super(potenciaMotor, matricula, eslora, anioFabricacion);
        this.nroCamarote = nroCamarote;
    }

    

    public int getNroCamarote() {
        return nroCamarote;
    }

    public void setNroCamarote(int nroCamarote) {
        this.nroCamarote = nroCamarote;
    }

    @Override
    public String toString() {
        return "BarcoYate{" + "nroCamarote=" + nroCamarote + '}';
    }
    
    
}
