package Units;

import java.util.ArrayList;

public class Xbowman extends Shooter{
    public Xbowman(String name, int x, int y, ArrayList<BaseUnit> team) {
        super(35, 2, 5, name, x, y, team, 10);
    }
}
