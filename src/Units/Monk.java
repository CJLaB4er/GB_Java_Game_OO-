package Units;

import java.util.ArrayList;

public class Monk extends Magic{
    public Monk(String name, int x, int y, ArrayList<BaseUnit> team) {
        super(20, 3, 3, name, x, y, team, 20);
    }
}
