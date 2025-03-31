package com.cofremoedas;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas = new ArrayList<>();

    public Cofrinho() {
        // construtor vazio
    }

    // método para adicionar moeda ao cofre
    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
        System.out.println("Moeda adicionada!");
    }

    // método para remover moeda do cofre
    public void remover(Moeda moeda) {
        if (moedas.remove(moeda)) {
            System.out.println("Moeda removida!");
        } else {
            System.out.println("Moeda não encontrada!");
        }
    }

    // método para listar as moedas no cofre
    public void listagemMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho vazio!");
        } else {
            System.out.println("Moedas no cofre:");
            for (Moeda moeda : moedas) {
                moeda.info();
            }
        }
    }

    // método para calcular o total em Reais
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converter();
        }
        return total;
    }
}
