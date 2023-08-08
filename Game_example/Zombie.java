package Game_example;

public class Zombie extends Enemy {
    @Override
    public void attack() {
        System.out.println("Zombie attacks with " + damage + " damage.");
    }

    public Zombie() {
        health = 100;
        damage = 5;

    }
}
