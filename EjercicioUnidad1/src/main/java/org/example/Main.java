package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Productos.*;
import Envios.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<product>Prendas=new ArrayList<product>();
        ArrayList<product>Dispositivos=new ArrayList<product>();
        ArrayList<product>Vehiculos=new ArrayList<product>();
        BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un Código de producto");
        int CodigoProducto= Integer.parseInt(lector.readLine());
        while (CodigoProducto!=0) {

            if (CodigoProducto == 1) {
                System.out.println("Ingrese un talle");
                int Talle = Integer.parseInt(lector.readLine());

                System.out.println("Ingrese un modelo");
                String Modelo = lector.readLine();

                System.out.println("Ingrese un color");
                String Color = lector.readLine();

                FabricaProductos prenda = new SelectordeProductos().SeleccionarProducto(TiposProducto.ROPA);
                product NuevaPrenda = prenda.CrearProducto();
                Prendas.add(NuevaPrenda);


            } else if (CodigoProducto == 2) {
                System.out.println("Ingrese la marca");
                String Marca = lector.readLine();

                System.out.println("Ingrese el modelo");
                String Modelo = lector.readLine();

                System.out.println("Ingrese la capacidad de  memoria");
                int Memoria = Integer.parseInt(lector.readLine());

                FabricaProductos dispositivo = new SelectordeProductos().SeleccionarProducto(TiposProducto.ELECTRONICA);
                dispositivo.CrearProducto();
                Dispositivos.add(dispositivo.CrearProducto());

            } else {
                System.out.println ("Ingrese el tipo de vehículo");
                String tipo = lector.readLine();

                System.out.println("Ingrese la marca");
                String Marca = lector.readLine();

                System.out.println ("Ingrese el modelo");
                String Modelo = lector.readLine();

                System.out.println ("Ingrese la cilindrada");
                int Cilindrada = Integer.parseInt(lector.readLine());

                System.out.println ("ingrese la version");
                String version = lector.readLine();

                FabricaProductos vehiculo = new SelectordeProductos().SeleccionarProducto(TiposProducto.VEHICULOS);
                vehiculo.CrearProducto();
                Vehiculos.add(vehiculo.CrearProducto());

            }
            System.out.println ("Ingrese el precio");
            double Precio = Double.parseDouble(lector.readLine());

            // Calculo Costo de envío
            System.out.println("Ingrese el peso");
            int Peso = Integer.parseInt(lector.readLine());
            System.out.println("Ingrese el largo");
            double largo = Double.parseDouble(lector.readLine());
            System.out.println("Ingrese el ancho");
            double ancho = Double.parseDouble(lector.readLine());
            System.out.println("Ingrese el origen");
            String Origen = lector.readLine();
            System.out.println("Ingrese el destino");
            String Destino = lector.readLine();

            //Elegir la estrategia de envío
            System.out.println("Ingrese el método de envío");
            int Metodo = Integer.parseInt(lector.readLine());


            // Envíos
            CalculosDelEnvio envioTierra = new CalculosDelEnvio(13000, 1800, 4200, "Rafaela", "Sunchales", new EnvioPorTierra());
            CalculosDelEnvio envioBarco = new CalculosDelEnvio(200000, 200, 1450, "Rafaela", "Paris", new EnvioPorBarco());
            CalculosDelEnvio envioAvion = new CalculosDelEnvio(150000, 300, 2100, "Rafaela", "Bogota", new EnvioPorAvion());


            if (Metodo == 1) {
                double PrecioTotal = Precio + envioTierra.CalcularCosto();
                System.out.println("El precio total es " + PrecioTotal);
            } else if (Metodo == 2) {
                double PrecioTotal = Precio + envioBarco.CalcularCosto();
                System.out.println("El precio total es " + PrecioTotal);
            } else if (Metodo==3) {
                double PrecioTotal = Precio + envioAvion.CalcularCosto();
                System.out.println("El precio total es " + PrecioTotal);
            }


            System.out.println("Ingrese un Código de producto");
            CodigoProducto = Integer.parseInt(lector.readLine());

            }
    }
}


