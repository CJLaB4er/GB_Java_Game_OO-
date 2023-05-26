package Units;

import java.util.ArrayList;
import java.util.List;

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
        this.team = team;
    }

    public int compareTo(Object item) {
        BaseUnit unit = (BaseUnit) item;
        return this.initiative - unit.initiative;
    }

    // Персонаж проверяет, что он не мёртв
    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        if (hp < 1) die = true;
        if (hp > maxHP) hp = maxHP;
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
            return simbDie + " "
                    + this.getClass().getSimpleName() + ' '
                    + this.name + ' '
                    + simbHP + this.hp + '/'
                    + this.maxHP + ' '
                    + simbDamage
                    + this.damage;
        return this.getClass().getSimpleName() + ' '
                + this.name + ' '
                + simbHP + this.hp + '/'
                + this.maxHP + ' '
                + simbDamage + this.damage;
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }

    @Override
    public BaseUnit findTarger(ArrayList<BaseUnit> team) {
        BaseUnit target = null;
        float minDist = 50f;
        for (BaseUnit unit : team) {
            if (unit.die) continue;
            float tmp = unit.coord.getDistanse(this.coord);
            if (tmp < minDist){
                minDist = tmp;
                target = unit;
            }
        }
        return target;
    }
}
