package Units;

import java.util.ArrayList;

public abstract class Shooter extends BaseUnit {
    // параметр ammunition отвечает за возможное кол-во выстрелов
    protected int ammunition;
    protected int maxAmmunition;

    public Shooter(int maxHP, int initiative, int damage, String name, int x, int y,
                   ArrayList<BaseUnit> team, int ammunition) {
        super(maxHP, initiative, damage, name, x, y, team);
        this.ammunition = ammunition;
        this.maxAmmunition = ammunition;
    }

    @Override
    public String toString() {
        return super.toString() + ' '
                + "ammo:" + this.ammunition
                + '/' + this.maxAmmunition;
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        super.step(enemys);
        if (!this.die()){
            BaseUnit target = findTarger(enemys);
            if (target != null && this.ammunition > 0) {
                target.hp =  target.hp - this.damage;
                this.ammunition--;
            }
        }
    }
}
