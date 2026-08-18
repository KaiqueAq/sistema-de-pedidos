package org.example;

import java.util.Scanner;

public class Dowhile {
    static void main() {
        Scanner ler = new Scanner(System.in);

        int alvaliacao;
        do{
            System.out.println("Avalie nosso atendimento, de 1 a 5 estrelas:");
            alvaliacao = ler.nextInt();
        }while (alvaliacao < 1 || alvaliacao > 5);
        System.out.println("Obrigado!");
    }
}
