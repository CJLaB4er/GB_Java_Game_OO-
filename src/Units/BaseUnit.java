package Units;

public class BaseUnit implements GameInterface {
    protected int hp, maxHP, initiative;
    protected String name;
    protected boolean die;

    public BaseUnit(int maxHP, int initiative, String name) {
        this.hp = maxHP;
        this.maxHP = maxHP;
        this.initiative = initiative;
        this.name = name;
        this.die = false;
    }

    // Персонаж проверяет, что он не мёртв
    @Override
    public void step() {
        if (!die) {
            if (hp < 1) die = true;
        }
    }
}
