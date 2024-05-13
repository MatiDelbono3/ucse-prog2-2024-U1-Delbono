package Productos;
import Productos.Producto;
public class FabricaVehiculos extends FabricaProductos{
    @Override
    public product CrearProducto() {
        return new Vehiculos();
    }
}
