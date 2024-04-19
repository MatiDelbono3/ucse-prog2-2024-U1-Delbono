package Pagos;

public class ProcesadorPagosPayPal extends ProcesadorDePagos{

    @Override
    public void ProcesarPago(int Monto) {
        System.out.println("Procesando un pago con Paypal de " + Monto);

    }

    @Override
    public void ReintegrarPagos(int MontoReintegro) {
        System.out.println("Reintegrando a través de Paypal" + MontoReintegro);
    }



    @Override
    public void Autorizar(int MontoAAutorizar) {
        System.out.println("Autorizando un pago a través de PayPal de" + MontoAAutorizar );
    }

    @Override
    public void Capturar(int MontoACapturar) {
        System.out.println("Capturando un pago a través de MercadoPago" + MontoACapturar);
    }
}
