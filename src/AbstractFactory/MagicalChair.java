package AbstractFactory;

public class MagicalChair implements Chair {

    public void doMagic() {
        System.out.println("Magic (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ ¸.•´¸.•*¸.•*´¨`*•.");
    }

    @Override
    public String toString() {
        return "MagicalChair feels quite soft... Unless you can't see it!";
    }
}
