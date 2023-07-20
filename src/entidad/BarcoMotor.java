
package entidad;


public class BarcoMotor extends Barco {
    
    protected int potenciaMotor;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaMotor, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaMotor = potenciaMotor;
    }

    

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potenciaMotor=" + potenciaMotor + '}';
    }
    
    
    
}
