
package entidad;

public class BarcoVelero extends Barco{
    
    protected int nroMastiles;

    public BarcoVelero() {
    }

    public BarcoVelero(int nroMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

   

    

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return "BarcoVelero{" + "nroMastiles=" + nroMastiles + '}';
    }
    
    
}
