package Game_example;

abstract class Enemy {
    protected int health;
    protected int damage;

    public abstract void attack();

    public void takeDamage(int damage) {
        health -= damage;
        if (health<= 0) {
            System.out.println("Enemy defeated");
        }

    }

}
