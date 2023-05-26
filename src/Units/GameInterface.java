package Units;

import java.util.ArrayList;
import java.util.List;

public interface GameInterface {
    void step(ArrayList<BaseUnit> enemys);

    String getInfo();

    BaseUnit findTarger(ArrayList<BaseUnit> team);

}
