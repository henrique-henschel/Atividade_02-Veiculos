package org.example;

public class Onibus extends Veiculo {
    private int quantidadeEixos;
    private static final int CAPACIDADE_TANQUE = 200;
    private static final double CONSUMO = 5.0;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("ERRO! Quantidade de eixos deve ser entre 6 e 8");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        return CAPACIDADE_TANQUE * CONSUMO;
    }
}
