package Builder;

public class Human {
    int age;
    String name;
    String birthDate;
    int weight;

    @Override
    public String toString() {
        return "Human " +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight;
    }

    public static class Builder {
        private Human buildHuman;

        public Builder() {
            this.buildHuman = new Human();
        }

        public Builder withName(String name)
        {
            buildHuman.name = name;
            return this;
        }

        public Builder withAge(int age)
        {
            buildHuman.age = age;
            return this;
        }

        public Builder withWeight(int weight)
        {
            buildHuman.weight = weight;
            return this;
        }

        public Builder withBirthdate(String birthDate)
        {
            buildHuman.birthDate = birthDate;
            return this;
        }

        public Human build()
        {
            return buildHuman;
        }
    }
}
