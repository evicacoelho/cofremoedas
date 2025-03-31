package com.cofremoedas;

public class Real extends Moeda {
    // construtor que recebe o valor da classe abstrata Moeda
    public Real(double valor) {
        super(valor);
    }
    
    // método para exibir informações da moeda
    @Override
    public void info() {
        System.out.println("Real: " + valor);
    }

    // método para converter Real em Real (sem conversão)
    @Override
    public double converter() {
        return valor;
    }
}
