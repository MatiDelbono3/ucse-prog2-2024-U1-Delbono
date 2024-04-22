package Pagos;

public class ManejadordePagos {
    public void ProcesadorPagos(int MontoAPagar, TiposPago tipodePago) {
        if (tipodePago==TiposPago.MERCADOPAGO) {
            System.out.println("realizando un pago de" + MontoAPagar + "pesos con MercadoPago");
        }
        else {
            System.out.println("realizando un pago de" + MontoAPagar + "pesos con PayPal");
        }
    }
}
