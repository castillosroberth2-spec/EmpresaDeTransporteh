package ec.edu.espoch.empresadetransporteh.Modelo;

public class ServicioEjecutivoUrbano extends UnidadDeTransporte {
    
    private int viajesDiarios;
    private double cosumoCombustibles;

    public ServicioEjecutivoUrbano(int viajesDiarios, double cosumoCombustibles, int codigo, String marca, String modelo, int añodefabricacion, double kilometrajerecorrido, double costoBase) {
        super(codigo, marca, modelo, añodefabricacion, kilometrajerecorrido, costoBase);
        this.viajesDiarios = viajesDiarios;
        this.cosumoCombustibles = cosumoCombustibles;
    }

    @Override
    public double getCostoBase() {
        return super.getCostoBase(); 
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Viajes diarios: " + viajesDiarios);
        System.out.println("Consumo: " + consumoCombustibles);
    }
    
}
