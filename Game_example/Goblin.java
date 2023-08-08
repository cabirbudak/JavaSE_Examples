package Game_example;

public class Goblin extends Enemy {
    @Override
    public void attack() {
        System.out.println("Goblin attacks with " + damage + " damage.");
    }

    public Goblin() {
        health = 50;
        damage = 10;

    }
}
