package Units;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class BaseUnit implements GameInterface {
    protected int hp, maxHP, initiative, damage;
    protected String name;
    protected boolean die;
    protected Coord coord;
    protected ArrayList<BaseUnit> team;

    public BaseUnit(int maxHP, int initiative, int damage, String name, int x, int y, ArrayList<BaseUnit> team) {
        this.hp = maxHP;
        this.maxHP = maxHP;
        this.initiative = initiative;
        this.name = name;
        this.die = false;
        this.damage = damage;
        this.coord = new Coord(x, y);
    }

    public int compareTo(Object item) {
        BaseUnit unit = (BaseUnit) item;
        return this.initiative - unit.initiative;
    }

    // Персонаж проверяет, что он не мёртв
    @Override
    public void step() {
        if (!die) {
            if (hp < 1) die = true;
        }
    }
}
