package AbstractFactory;

public interface AbstractChairFactory {

    VictorianChair createVictorianChair(int age);
    MagicalChair createMagicalChair();
    FunctionalChair createFunctionalChair();
}
