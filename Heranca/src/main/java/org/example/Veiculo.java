package org.example;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int capacidadePassageiros;
    private String combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public abstract double calcularAutonomia();

    public void exibirDetalhes() {
        System.out.println("INFORMACOES DO VEICULO:");
        System.out.println("> Marca: " + this.getMarca());
        System.out.println("> Modelo: " + this.getModelo());
        System.out.println("> Ano: " + this.getAno());
        System.out.println("> Capacidade de passageiros: " + this.getCapacidadePassageiros() + " pessoas");
        System.out.println("> Combustivel: " + this.getCombustivel());
    }
}
