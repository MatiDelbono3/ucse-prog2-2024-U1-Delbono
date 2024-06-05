package Pagos;

public class IngresodePagosPayPal extends ProcesadorDePagos implements IngresodePagos {
    @Override
    public void ProcesarPago(double Monto) {
        System.out.println("Procesando un pago de " + Monto + "pesos");
    }

    @Override
    public void ReintegrarPagos(double MontoReintegro) {
    System.out.println(" Reintegrando " + MontoReintegro + "Pesos con PayPal");
}
    @Override
    public void Autorizar(double MontoAAutorizar) {
        System.out.println(" Autorizando un pago de" + MontoAAutorizar + "pesos con PayPal");
    }

    @Override
    public void Capturar(double MontoACapturar) {
        System.out.println("Capturando un pago de" + MontoACapturar +"pesos con PayPal" );
    }
}
