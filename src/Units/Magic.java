package Units;

import java.util.ArrayList;

public abstract class Magic extends BaseUnit{
    int mp, maxMp;

    public Magic(int maxHP, int initiative, int damage, String name, int x, int y, ArrayList<BaseUnit> team,
                 int maxMp) {
        super(maxHP, initiative, damage, name, x, y, team);
        this.mp = maxMp;
        this.maxMp = maxMp;
    }
}
