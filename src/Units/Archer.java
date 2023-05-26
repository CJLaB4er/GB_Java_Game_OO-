package Units;

import java.util.ArrayList;

public class Archer extends Shooter {
//    private final Character simbArch = '\u27b4';

    public Archer(String name, int x, int y, ArrayList<BaseUnit> team) {
        super(20, 1, 5,
                name, x, y, team, 10);
    }


}
