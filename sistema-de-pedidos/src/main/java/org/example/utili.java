package org.example;

public class  utili{
public static void limpaTela() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    } catch (Exception e) {
        // Se falhar, apenas pula linhas
        System.out.println("\n\n\n\n\n");
    }
}
    public static void dimi() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }


}
