package Factory;

public class VictorianChair {
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
