package Pagos;

public class ProcesadorPagosMercadoPago extends ProcesadorDePagos{
    public ProcesadorPagosMercadoPago(IngresodePagos ingresodePagos) {
        super(ingresodePagos);
    }

    @Override
    public void ProcesarPago(int Monto) {
        System.out.println("Procesando un pago con MercadoPago de" + Monto);
    }

    @Override
    public void ReintegrarPagos(int MontoReintegro) {
        System.out.println("Reintegrando a través de MercadoPago " +MontoReintegro);
    }


}
