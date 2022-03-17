package Prototype;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(45,"John","Smith", "10.03.1977", 95);
        System.out.println("Creating original: \n" + h1);
        Human clone = (Human)h1.clone();
        System.out.println("Creating clone: \n" + clone);
    }
}
