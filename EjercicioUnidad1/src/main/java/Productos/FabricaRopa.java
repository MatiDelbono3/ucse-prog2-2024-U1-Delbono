package Productos;

public class FabricaRopa extends FabricaProductos{
    @Override
    public product CrearProducto() {
        return new Ropa();
        }
    }
