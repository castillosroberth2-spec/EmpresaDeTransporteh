package ec.edu.espoch.empresadetransporteh.Modelo;

public abstract class UnidadDeTransporte  {
   private int codigo;
   private String marca;
   private  String modelo;
   private  int añodefabricacion;
   private double kilometrajerecorrido;
   private double costoBase;

    public UnidadDeTransporte(int codigo, String marca, String modelo, int añodefabricacion, double kilometrajerecorrido, double costoBase) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.añodefabricacion = añodefabricacion;
        this.kilometrajerecorrido = kilometrajerecorrido;
        this.costoBase = costoBase;
    }

    public int getAñodefabricacion() {
        return añodefabricacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometrajerecorrido() {
        return kilometrajerecorrido;
    }

    public double getCostoBase() {
        return costoBase;
    }  

    void mostrarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
