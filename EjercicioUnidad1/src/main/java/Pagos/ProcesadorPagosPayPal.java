package Pagos;

public class ProcesadorPagosPayPal extends ProcesadorDePagos{



    @Override
    public void ProcesarPago(double Monto) {
        System.out.println("Procesando un pago con Paypal de " + Monto);

    }

    @Override
    public void ReintegrarPagos(double MontoReintegro) {
        System.out.println("Reintegrando a través de Paypal" + MontoReintegro);
    }



}
