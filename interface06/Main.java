package interface06;

public class Main {
    public static void main(String[] args) {
    Hawk hawk = new Hawk();

    hawk.hunt();

    Rabbit rabbit = new Rabbit();

    rabbit.flee();

    Fish fish = new Fish();
    fish.hunt();
    fish.flee();

    }
}
