package Units;

import java.util.ArrayList;

public abstract class Melle extends BaseUnit{
    public Melle(int maxHP, int initiative, int damage, String name, int x, int y, ArrayList<BaseUnit> team) {
        super(maxHP, initiative, damage, name, x, y, team);
    }
}
