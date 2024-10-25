public abstract class Unit extends GameObject {
    private boolean alive;
    private float Hp;
    private float damage;

    public boolean isAlive() {
        if (Hp > 0) {
            return alive;
        } else {
            return false;
        }
    }

    public float getHp() {
        return Hp;
    }

    public void receiveDamage(float damage) {
        Hp -= damage;
    }
}
