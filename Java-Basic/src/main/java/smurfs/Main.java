package smurfs;

public class Main {
    static void main() {
        Cachorro cao = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();

        System.out.println("Cachorro: " + cao.emitirSom());
        System.out.println("Gato: " + gato.emitirSom());
        System.out.println("Galo: " + galo.emitirSom());
        System.out.println("Pato: " + pato.emitirSom());

    }
}
