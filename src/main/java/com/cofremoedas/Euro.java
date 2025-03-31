package com.cofremoedas;

public class Euro extends Moeda {
    private static final double TAXA_CONVERSAO = 6.0; // Exemplo de taxa de conversão

    // construtor que recebe o valor da classe abstrata Moeda
    public Euro(double valor) {
        super(valor);
    }

    // método para exibir informações da moeda
    @Override
    public void info() {
        System.out.println("Euro: " + valor);
    }

    // método para converter Euro em Real
    @Override
    public double converter() {
        return valor * TAXA_CONVERSAO;
    }

}
