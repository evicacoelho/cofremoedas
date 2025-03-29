package com.cofremoedas;

public class Euro extends Moeda {
    private static final double TAXA_CONVERSAO = 6.0; // Exemplo de taxa de conversão

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro: " + valor);
    }

    @Override
    public double converter() {
        return valor * TAXA_CONVERSAO;
    }

}
