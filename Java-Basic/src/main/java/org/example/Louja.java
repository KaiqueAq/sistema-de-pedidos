package org.example;

import java.util.Scanner;

public class Louja {
    static void main() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.next();
        System.out.println("Digite o valor da compra: ");
        double nota1 = ler.nextDouble();

        double media = (nota1 /5 );
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Valor da sua prestação %d: %.1f%n" ,i, media);
        }
    }
}
