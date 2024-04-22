package Pagos;

public abstract class ProcesadorDePagos  {
    public  IngresodePagos ingresodePagos;
    public abstract void ProcesarPago(int  Monto);
    public abstract void ReintegrarPagos(int MontoReintegro);
    public ProcesadorDePagos(IngresodePagos ingresodePagos){
        this.ingresodePagos=ingresodePagos;
    }
}
