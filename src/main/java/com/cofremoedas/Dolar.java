package com.cofremoedas;

public class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO = 5.5; // Exemplo de taxa de conversão

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dólar: " + valor);
    }

    @Override
    public double converter() {
        return valor * TAXA_CONVERSAO;
    }

}
