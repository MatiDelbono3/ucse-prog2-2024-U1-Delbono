package Productos;

public class SelectordeProductos {
    public FabricaProductos SeleccionarProducto(TiposProducto tipoProducto) {
        if (tipoProducto==TiposProducto.ROPA) {
            return new FabricaRopa();
        }
        else if (tipoProducto == TiposProducto.ELECTRONICA) {
            return new FabricaElectronica();
        }
        else {
            return new FabricaVehiculos();
        }

    }
}
