package Units;

public class BaseUnit implements GameInterface{
    protected int hp, maxHP, initiative;
    String name;
    boolean die;

    public BaseUnit(int hp, int maxHP, int initiative, String name) {
        this.hp = hp;
        this.maxHP = maxHP;
        this.initiative = initiative;
        this.name = name;
        this.die = false;
    }

    @Override
    public void step() {
        if (hp < 1) die = true;
    }
}
