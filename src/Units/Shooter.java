package Units;

import java.util.ArrayList;

public abstract class Shooter extends BaseUnit {
    // параметр ammunition отвечает за возможное кол-во выстрелов
    protected int ammunition;

    public Shooter(int maxHP, int initiative, int damage, String name, int x, int y,
                   ArrayList<BaseUnit> team, int ammunition) {
        super(maxHP, initiative, damage, name, x, y, team);
        this.ammunition = ammunition;
    }

}
