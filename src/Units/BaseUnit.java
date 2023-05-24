package Units;

public abstract class BaseUnit implements GameInterface {
    protected int hp, maxHP, initiative, damage;
    protected String name;
    protected boolean die;

    public BaseUnit(int maxHP, int initiative, int damage, String name) {
        this.hp = maxHP;
        this.maxHP = maxHP;
        this.initiative = initiative;
        this.name = name;
        this.die = false;
        this.damage = damage;
    }

    // Персонаж проверяет, что он не мёртв
    @Override
    public void step() {
        if (!die) {
            if (hp < 1) die = true;
        }
    }
}
