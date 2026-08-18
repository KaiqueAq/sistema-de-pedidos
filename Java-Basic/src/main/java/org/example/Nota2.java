package org.example;

import java.util.Scanner;


public class Nota2 {
    static void main() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.next();
        System.out.println("Digite sua primeira nota: ");
        double nota1 = ler.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = ler.nextDouble();

        double media = ((nota1 + nota2) / 2);
        System.out.println("Média:" + media);
        if (media > 7) {
            System.out.println("aprovado");
        } else if ((media > 5) & (media < 6.9)) {
            System.out.println("VERFICAR SUPLEMENTAR");
        } else {
            System.out.println("reprovado");
        }
    }
}

