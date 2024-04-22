package Envios;

import jdk.jshell.PersistentSnippet;

import javax.lang.model.util.Elements;

public class CalculosDelEnvio {
    private int Peso;
    private double[] Dimensiones;
    private String Origen;
    private String Destino;
    private EstrategiasdeEnvio estrategiadeenvio;
    public CalculosDelEnvio(int Peso, double[] Dimensiones, String Origen, String Destino, EstrategiasdeEnvio estrategiadeenvio) {
        this.Peso=Peso;
        this.Dimensiones=Dimensiones;
        this.Origen=Origen;
        this.Destino=Destino;
        this.estrategiadeenvio=estrategiadeenvio;

    }
    public double CalcularCosto(){
        return estrategiadeenvio.CalcularCosto(Peso, Dimensiones, Origen, Destino);
    }

}
