package Pagos;

public class ProcesadorPagosPayPal extends ProcesadorDePagos{

    public ProcesadorPagosPayPal(IngresodePagos ingresodePagos) {
        super(ingresodePagos);
    }

    @Override
    public void ProcesarPago(int Monto) {
        System.out.println("Procesando un pago con Paypal de " + Monto);

    }

    @Override
    public void ReintegrarPagos(int MontoReintegro) {
        System.out.println("Reintegrando a través de Paypal" + MontoReintegro);
    }



}
