package org.example;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double distanciaViaje,consumoCombustible, precioCombustible;
        double consumoTotal, costoTotal;




        Scanner scanner = new Scanner(System.in);

        // PIDO DATOS AL USUARIO
        System.out.print("Ingrese la distancia total del viaje en kilómetros: ");
        distanciaViaje = scanner.nextDouble();

        System.out.print("Ingrese el consumo de combustible del carro (litros por cada 100 km): ");
        consumoCombustible = scanner.nextDouble();

        System.out.print("Ingrese el precio por litro de combustible: ");
        precioCombustible = scanner.nextDouble();





        scanner.close();

        // Calculo de los litros de combustible
        consumoTotal = (distanciaViaje / 100) * consumoCombustible;

        // Calcular el costo total del combustible necesario
        costoTotal = consumoTotal * precioCombustible;

        // Imprimir

        System.out.println("Distancia total del viaje: " + distanciaViaje + " km");
        System.out.println("Consumo de combustible: " + consumoCombustible + " litros por cada 100 km");
        System.out.println("Precio por litro de combustible: $" + precioCombustible);
        System.out.println("\nConsumo total de combustible: " + consumoTotal + " litros");
        System.out.println("Costo total de combustible: $" + costoTotal);
    }
}
  