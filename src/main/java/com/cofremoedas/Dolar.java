package com.cofremoedas;

public class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO = 5.5; // Exemplo de taxa de conversão

    // construtor que recebe o valor da classe abstrata Moeda
    public Dolar(double valor) {
        super(valor);
    }

    // método para exibir informações da moeda
    @Override
    public void info() {
        System.out.println("Dólar: " + valor);
    }

    // método para converter Dólar em Real
    @Override
    public double converter() {
        return valor * TAXA_CONVERSAO;
    }

}
