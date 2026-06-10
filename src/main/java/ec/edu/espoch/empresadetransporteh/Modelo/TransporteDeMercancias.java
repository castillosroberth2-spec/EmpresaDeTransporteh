package ec.edu.espoch.empresadetransporteh.Modelo;

public class TransporteDeMercancias extends UnidadDeTransporte {
    
    private double  capacidadCarga;
    private  int entregasRealizadas;

    public TransporteDeMercancias(double capacidadCarga, int entregasRealizadas, int codigo, String marca, String modelo, int añodefabricacion, double kilometrajerecorrido, double costoBase) {
        super(codigo, marca, modelo, añodefabricacion, kilometrajerecorrido, costoBase);
        this.capacidadCarga = capacidadCarga;
        this.entregasRealizadas = entregasRealizadas;
    }

    @Override
    public double getCostoBase() {
        return super.getCostoBase(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad carga: " + capacidadCarga);
        System.out.println("Entregas: " + entregasRealizadas);
    }
    
}
