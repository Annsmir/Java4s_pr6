package Builder;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human.Builder().withName("John Smith").withAge(45).withWeight(95).withBirthdate("10.03.1977").build();
        System.out.println("Creating the first human: \n" + h1);
        Human h2 = new Human.Builder().withName("Sam Johns").withAge(54).withWeight(59).withBirthdate("03.10.1968").build();
        System.out.println("Creating the second human: \n" + h2);
    }
}
