package livro;

public class Main {
    static void main() {
        Livro livro1 = new Livro("Picapau amarelo", "Kaique Silva", 80.6,99);
        Livro livro2 = new Livro("Saci", "Kaique Silva", 789.6,999);

        System.out.println(livro1.getAutor());

    }
}
