package Envios;

public class EnvioPorAvion implements EstrategiasdeEnvio{

    @Override
    public double CalcularCosto(int Peso, double[] Dimensiones, String Origen, String Destino) {
        return Peso*1.2;
    }
}
