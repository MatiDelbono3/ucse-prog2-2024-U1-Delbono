package Pagos;

public abstract class ProcesadorDePagos  {
    public  IngresodePagos ingresodePagos;
    public abstract void ProcesarPago(double  Monto);
    public abstract void ReintegrarPagos(double MontoReintegro);

}
