package Envios;

public class EnvioPorBarco implements EstrategiasdeEnvio{

    @Override
    public double CalcularCosto(int Peso, double largo, double ancho, String Origen, String Destino) {
        return Peso*0.9;
    }

    }

