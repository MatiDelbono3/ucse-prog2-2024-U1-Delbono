package Pagos;

public class ProcesadorPagosMercadoPago extends ProcesadorDePagos{

    @Override
    public void ProcesarPago(double Monto) {
        System.out.println("Procesando un pago con MercadoPago de" + Monto);
    }

    @Override
    public void ReintegrarPagos(double MontoReintegro) {
        System.out.println("Reintegrando a través de MercadoPago " +MontoReintegro);
    }


}
