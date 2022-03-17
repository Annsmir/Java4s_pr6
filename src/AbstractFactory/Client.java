package AbstractFactory;
import java.util.Scanner;

public class Client {
    public Chair chair;
    public void sit() {
        Scanner myScanner = new Scanner(System.in);
        ChairFactory myFact = new ChairFactory();
        System.out.println("Do you want to sit on...");
        System.out.println();

        System.out.println("... 150 years old VictorianChair?");
        chair = myFact.createVictorianChair(150);
        System.out.println(chair);
        System.out.println();

        System.out.println("... MagicalChair?");
        chair = myFact.createMagicalChair();
        ((MagicalChair) chair).doMagic();
        System.out.println(chair);
        System.out.println();

        System.out.println("... FunctionalChair?");
        chair = myFact.createFunctionalChair();
        System.out.println(chair + " It can sum 1234 and 4321! The result is " + ((FunctionalChair) chair).sum(1234, 4321));
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
