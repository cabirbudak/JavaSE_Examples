package Game_example;

public class Game {
    public static void main(String[] args) {
        Enemy goblin = new Goblin();
        Enemy zombie = new Zombie();

        goblin.attack();
        zombie.attack();

        goblin.takeDamage(15);
    }
}
