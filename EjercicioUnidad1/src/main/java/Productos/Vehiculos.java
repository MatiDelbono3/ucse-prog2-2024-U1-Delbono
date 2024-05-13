package Productos;

public class Vehiculos extends product implements Producto{
    private String Tipo;
    private String Marca;
    private String Modelo;
    private int Cilindrada;
    private int Version;
    private double Precio;
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        Cilindrada = cilindrada;
    }

    public int getVersion() {
        return Version;
    }

    public void setVersion(int version) {
        Version = version;
    }

    @Override
    public double ObtenerPrecio() {
        return 2000000;
    }
}
