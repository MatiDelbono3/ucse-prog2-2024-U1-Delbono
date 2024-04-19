package Productos;
import Productos.Producto;
public class FabricaVehiculos extends FabricaProductos{
    @Override
    public Producto CrearProducto() {
        return new Vehiculos();
    }
}
