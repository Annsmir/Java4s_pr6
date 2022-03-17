package Prototype;

interface Copyable {
    Object clone();
}

public class Human implements Copyable {
    int age;
    String firstName;
    String lastName;
    String birthDate;
    int weight;

    public Human(int age, String firstName, String lastName, String birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human " +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight;
    }

    @Override
    public Object clone() {
        return new Human(age, firstName, lastName, birthDate, weight);
    }
}
