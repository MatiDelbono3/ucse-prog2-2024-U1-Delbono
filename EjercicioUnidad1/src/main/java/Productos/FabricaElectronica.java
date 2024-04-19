package Productos;

public class FabricaElectronica extends FabricaProductos{
    @Override
    public Producto CrearProducto() {
        return new Electronica();
    }
}
