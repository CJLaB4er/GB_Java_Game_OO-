package Units;

import java.util.ArrayList;

public class Infantry extends Melle{
    public Infantry(String name, int x, int y, ArrayList<BaseUnit> team) {
        super(40, 5, 5, name, x, y, team);
    }
}
