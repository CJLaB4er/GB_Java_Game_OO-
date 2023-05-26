package Units;

import java.util.ArrayList;

public abstract class BaseUnit implements GameInterface {
    protected int hp, maxHP, initiative, damage;
    protected String name;
    protected boolean die;
    protected Coord coord;
    protected ArrayList<BaseUnit> team;

    private final Character simbHP = '\u2764';
    private final Character simbDamage = '\u2694';
    private final Character simbDie = '\u2620';

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
    public void step(ArrayList<BaseUnit> enemys) {
        if (hp < 1) die = true;
    }


    public int[] getCoord() {
        return this.coord.getCoord();
    }

    public boolean die() {
        return this.die;
    }

    @Override
    public String toString() {
        if (die)
            return this.getClass().getSimpleName() + ' '
                    + this.name + ' '
                    + simbHP + this.hp + '/' + this.maxHP + ' '
                    + simbDamage + this.damage + ' '
                    + simbDie;
        return this.getClass().getSimpleName() + ' '
                + this.name + ' '
                + simbHP + this.hp + '/' + this.maxHP + ' '
                + simbDamage
                + this.damage;
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
}
