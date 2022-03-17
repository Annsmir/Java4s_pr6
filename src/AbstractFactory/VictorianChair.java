package AbstractFactory;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return ("This " + this.age + " years old VictorianChair is very comfortable!");
    }
}
