package org.example;

public class CarroEletrico extends Carro {
    private double bateriakWh;
    private static final double CONSUMO_ELETRICO = 5.0;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, TipoCarro tipoCarro, double bateriakWh) {
        super(marca, modelo, ano, capacidadePassageiros, "ELETRICO", tipoCarro);
        this.bateriakWh = bateriakWh;
    }

    @Override
    public double calcularAutonomia() {
        return bateriakWh * CONSUMO_ELETRICO;
    }
}
