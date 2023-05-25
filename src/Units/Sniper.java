package Units;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(String name, int x, int y, ArrayList<BaseUnit> team) {
        super(20, 1, 5, name, x, y, team, 10);
    }
}
