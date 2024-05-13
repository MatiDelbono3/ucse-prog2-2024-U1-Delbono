package Productos;

public class FabricaElectronica extends FabricaProductos{
    @Override
    public product CrearProducto() {
        return new Electronica();
    }
}
