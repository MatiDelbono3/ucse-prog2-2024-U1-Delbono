package Productos;

public class Ropa extends product implements Producto  {
    private double Precio;
    private String Modelo;
    private int Talle;
    private String Color;


    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getTalle() {
        return Talle;
    }

    public void setTalle(int talle) {
        Talle = talle;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public double ObtenerPrecio() {
        return 3500;
    }
}
