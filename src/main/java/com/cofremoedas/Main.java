package com.cofremoedas;

import java.util.Scanner;

// classe principal
public class Main {
    // método main, ponto de entrada do programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();
        int opção;

        do {
            System.out.println("\nBem vindo ao Cofre de Moedas!!:");
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opção = scanner.nextInt();

            switch (opção) {
                case 1:
                    adicionarMoeda(cofre, scanner); // chama método para adicionar moeda
                    break;
                case 2:
                    removerMoeda(cofre, scanner); // chama método para remover moeda
                    break;
                case 3:
                    cofre.listagemMoedas(); // chama método pertencente à classe cofre, gerada na abstração da moeda, para listar moedas
                    break;
                case 4:
                    double totalConvertido = cofre.totalConvertido(); // chama método da classe cofre para calcular o total convertido
                    System.out.printf("Total convertido para Real: %.2f\n", totalConvertido);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opção != 0);

    }

    // método para adicionar moeda ao cofre baseado no switch case de cada tipo
    private static void adicionarMoeda(Cofrinho cofre, Scanner scanner) {
        System.out.println("\nEscolha o tipo de moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        System.out.print("Opção: ");
        int tipo = scanner.nextInt();

        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();

        Moeda moeda;
        switch (tipo) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido.");
                return;
        }
        cofre.adicionar(moeda);
        System.out.println("Moeda adicionada com sucesso!");
    }

    // método para remover moeda do cofre baseado no switch case de cada tipo
    private static void removerMoeda(Cofrinho cofre, Scanner scanner) {
        System.out.println("\nEscolha o tipo de moeda a remover:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        System.out.print("Opção: ");
        int tipo = scanner.nextInt();

        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();
        
        Moeda moeda;
        switch (tipo) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido.");
                return;
        }
        cofre.remover(moeda);
        System.out.println("Moeda removida com sucesso!");
    }
}