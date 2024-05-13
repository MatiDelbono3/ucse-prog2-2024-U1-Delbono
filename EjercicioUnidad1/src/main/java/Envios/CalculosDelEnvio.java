package Envios;

public class CalculosDelEnvio {
    private int Peso;
    private double Largo;
    private double Ancho;
    private String Origen;
    private String Destino;
    private EstrategiasdeEnvio estrategiadeenvio;
    public CalculosDelEnvio(int Peso, double ancho, double Largo, String Origen, String Destino, EstrategiasdeEnvio estrategiadeenvio) {
        this.setPeso(Peso);
        this.setLargo(Largo);
        this.setAncho(getAncho());
        this.setOrigen(Origen);
        this.setDestino(Destino);
        this.estrategiadeenvio=estrategiadeenvio;

    }



    public double CalcularCosto(){
        return getEstrategiadeenvio().CalcularCosto(getPeso(), getLargo(),getAncho(), getOrigen(), getDestino());
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }



    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public EstrategiasdeEnvio getEstrategiadeenvio() {
        return estrategiadeenvio;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double largo) {
        Largo = largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        Ancho = ancho;
    }
}
