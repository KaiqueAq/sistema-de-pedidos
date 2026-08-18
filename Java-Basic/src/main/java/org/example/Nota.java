package org.example;

import java.util.Scanner;

public class Nota {
    public static void main() {


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.next();
        System.out.println("Digite sua primeira nota: ");
        double nota1 = ler.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = ler.nextDouble();

        double media = ((nota1 + nota2) / 2);
        System.out.println("Média:" + media);
    }
}
