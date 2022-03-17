package Factory;

public class ChairFactory {
    public VictorianChair createVictorianChair() {
        return new VictorianChair(300);
    }

    public MagicalChair createMagicianChair() {
        return new MagicalChair();
    }

    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
