package heranca2;

public class Main {
    static void main() {
        Processador proc1 = new Processador("AMD", "RYZEN 7 10555k", "5999");
        Memoria me1 = new Memoria("CORSER", " DDR5", 32);
        PlacaMae p1 = new PlacaMae("Asus", "T51", "coisa");
        DispositivoArm d1 = new DispositivoArm("Intel", "g50", "500", "TIM");
        System.out.println(proc1);
        System.out.println(me1);
        System.out.println(p1);
        System.out.println(d1);
    }
}
