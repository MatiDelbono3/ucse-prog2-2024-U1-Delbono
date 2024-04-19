package Productos;

public class SelectordeProductos {
    public Producto SeleccionarProducto(TiposProducto tipoProducto) {
        if (tipoProducto==TiposProducto.ROPA) {
            return new Ropa();
        }
        else if (tipoProducto == TiposProducto.ELECTRONICA) {
            return new Electronica();
        }
        else {
            return new Vehiculos();
        }

    }
}
