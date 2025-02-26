package org.example;

public class Carro extends Veiculo {
    private TipoCarro tipoCarro;
    private static final int CAPACIDADE_TANQUE = 50;
    private static final double CONSUMO = 12.0;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, TipoCarro tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return CAPACIDADE_TANQUE * CONSUMO;
    }
}
