package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Corsa Wind", 1996, 5, "Gasolina", TipoCarro.HATCH);
        carro.exibirDetalhes();
        System.out.println("Autonomia do carro: " + carro.calcularAutonomia());

        System.out.println();

        Caminhao caminhao = new Caminhao("Volvo", "FH", 2019, 2, "Diesel", 5);
        caminhao.exibirDetalhes();
        System.out.println("Autonomia do caminhão: " + caminhao.calcularAutonomia());

        System.out.println();

        Onibus onibus = new Onibus("Mercedes", "Tourismo", 2021, 50, "Diesel", 6);
        onibus.exibirDetalhes();
        System.out.println("Autonomia do ônibus: " + onibus.calcularAutonomia());

        System.out.println();

        CarroEletrico carroEletrico = new CarroEletrico("BYD", "Dolphin", 2024, 5, TipoCarro.HATCH, 100);
        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia do carro elétrico: " + carroEletrico.calcularAutonomia());

        System.out.println();

        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R450", 2020, 2, "Diesel", 10, -18.0);
        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia do caminhão refrigerado: " + caminhaoRefrigerado.calcularAutonomia());
    }
}
