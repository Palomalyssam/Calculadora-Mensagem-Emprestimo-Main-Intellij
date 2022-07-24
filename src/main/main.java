package main;

import static main.calculadora.soma;

/**
 * Classe principal por exercicios da aula 1 de Métodos.
 */

public class main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        calculadora.soma ( 3, 6);
        calculadora.subtracao ( 9, 1.8);
        calculadora.multiplicacao ( 7, 8);
        calculadora.divisao ( 5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercício empréstimo");
        Empréstimo.calcular(1000, Empréstimo.getDuasParcelas());
        Empréstimo.calcular(1000, Empréstimo.getTresParcelas());
        Empréstimo.calcular(1000, 5);

    }
}
