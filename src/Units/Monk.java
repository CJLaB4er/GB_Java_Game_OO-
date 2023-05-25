package Units;

import java.util.ArrayList;

public class Monk extends Magic{
    public Monk(int maxHP, int initiative, int damage, String name, int x, int y, ArrayList<BaseUnit> team,
                int mp, int maxMp) {
        super(20, 3, 5, name, x, y, team, 20);
    }
}
