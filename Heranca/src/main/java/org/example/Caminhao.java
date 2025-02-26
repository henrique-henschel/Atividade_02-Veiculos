package org.example;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private static final int CAPACIDADE_TANQUE = 300;
    private static final double CONSUMO_BASE = 6.0;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double reducao;
        if (getCapacidadeCarga() <= 25) {
            reducao = getCapacidadeCarga() / 100.0;
        } else {
            reducao = 25.0 / 100.0;
        }
        double consumoEfetivo = CONSUMO_BASE * (1.0 - reducao);
        return CAPACIDADE_TANQUE * consumoEfetivo;
    }
}
