package Units;

public class BaseUnit {
    protected int hp, maxHP, initiative;
    String name;

    public BaseUnit(int hp, int maxHP, int initiative, String name) {
        this.hp = hp;
        this.maxHP = maxHP;
        this.initiative = initiative;
        this.name = name;
    }
}
