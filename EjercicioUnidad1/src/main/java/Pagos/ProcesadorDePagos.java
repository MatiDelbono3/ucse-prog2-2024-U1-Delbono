package Pagos;

public abstract class ProcesadorDePagos implements IngresodePagos {
    public  IngresodePagos ingresodePagos;
    public abstract void ProcesarPago(int  Monto);
    public abstract void ReintegrarPagos(int MontoReintegro);
}
