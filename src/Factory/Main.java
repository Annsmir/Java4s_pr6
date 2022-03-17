package Factory;

public class Main {
    public static void main (String[] args) {
        ChairFactory cf = new ChairFactory();

        FunctionalChair functionalChair = cf.createFunctionalChair();
        System.out.println(functionalChair.sum(5,6));

        MagicalChair magicChair = cf.createMagicianChair();
        magicChair.doMagic();

        VictorianChair victorianChair = cf.createVictorianChair();
        System.out.println(victorianChair);
    }
}
