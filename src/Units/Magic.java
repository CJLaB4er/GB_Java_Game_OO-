package Units;

import java.util.ArrayList;

public abstract class Magic extends BaseUnit {
    int mp, maxMp;

    public Magic(int maxHP, int initiative, int damage, String name, int x, int y, ArrayList<BaseUnit> team,
                 int maxMp) {
        super(maxHP, initiative, damage, name, x, y, team);
        this.mp = maxMp;
        this.maxMp = maxMp;
    }

    @Override
    public String toString() {
        return super.toString() + ' '
                + "MP:" + this.mp
                + '/' + this.maxMp;
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        super.step(enemys);
        if (!this.die()) {
            BaseUnit target = whoNeedHeal();
            if (target != null) target.hp = target.hp + this.damage;
        }
    }

    protected BaseUnit whoNeedHeal() {
        BaseUnit target = null;
        for (BaseUnit unit : this.team) {
            if (unit.hp < unit.maxHP && target == null) {
                target = unit;
            } else if (unit.hp < unit.maxHP && unit.hp < target.hp) {
                target = unit;
            }
        }
        return target;
    }

}
