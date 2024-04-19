package Productos;

public class FabricaRopa extends FabricaProductos{
    @Override
    public Producto CrearProducto() {
        return new Ropa();
        }
    }
