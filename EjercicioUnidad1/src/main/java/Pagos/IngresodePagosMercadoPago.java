package Pagos;

public class IngresodePagosMercadoPago extends ProcesadorDePagos implements IngresodePagos{

    public IngresodePagosMercadoPago(IngresodePagos ingresodePagos) {
        super(ingresodePagos);
    }

    @Override
    public void Autorizar(int MontoAAutorizar) {
        System.out.println("Autorizando un pago de" + MontoAAutorizar + "pesos con MercadoPago");
    }

    @Override
    public void Capturar(int MontoACapturar) {
        System.out.println("Capturando un pago de" + MontoACapturar + "pesos con MercadoPago");
    }

    @Override
    public void ProcesarPago(int Monto) {
        System.out.println("Procesando un pago de" + Monto + "pesos con MercadoPago");
    }

    @Override
    public void ReintegrarPagos(int MontoReintegro) {
        System.out.println("Reintegrando" + MontoReintegro + "pesos con MercadoPago");
    }
}
