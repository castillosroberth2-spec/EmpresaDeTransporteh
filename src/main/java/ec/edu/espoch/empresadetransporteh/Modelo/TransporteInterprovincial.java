package ec.edu.espoch.empresadetransporteh.Modelo;

public class TransporteInterprovincial extends UnidadDeTransporte{
  private int capacidadPasajero;
  private int rutasAsignadas;

    public TransporteInterprovincial(int capacidadPasajero, int rutasAsignadas, int codigo, String marca, String modelo, int añodefabricacion, double kilometrajerecorrido, double costoBase) {
        super(codigo, marca, modelo, añodefabricacion, kilometrajerecorrido, costoBase);
        this.capacidadPasajero = capacidadPasajero;
        this.rutasAsignadas = rutasAsignadas;
    }

    @Override
    public double getCostoBase() {
        return super.getCostoBase(); 
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad: " + capacidadPasajero);
        System.out.println("Rutas: " + rutasAsignadas);
    }
}
    
