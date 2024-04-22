package Pagos;

public class IngresodePagosPayPal extends ProcesadorDePagos implements IngresodePagos {
    @Override
    public void ProcesarPago(int Monto) {
        System.out.println("Procesando un pago de " + Monto + "pesos");
    }

    @Override
    public void ReintegrarPagos(int MontoReintegro) {
        System.out.println("reintegrando" + MontoReintegro + "pesos");
    }

    public IngresodePagosPayPal(IngresodePagos ingresodePagos){
    super(ingresodePagos);
}
    @Override
    public void Autorizar(int MontoAAutorizar) {
        System.out.println(" Autorizando un pago de" + MontoAAutorizar + "pesos con PayPal");
    }

    @Override
    public void Capturar(int MontoACapturar) {
        System.out.println("Capturando un pago de" + MontoACapturar +"pesos con PayPal" );
    }
}
