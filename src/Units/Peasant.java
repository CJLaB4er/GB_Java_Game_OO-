package Units;

import java.util.ArrayList;

public class Peasant extends BaseUnit {
    /*
    Создание юнита "Крестьянин", параметр "name" передаётся при создании объекта,
    остальные параметры передаются через конструктор в базовый класс.
     */
    public Peasant(String name, int x, int y, ArrayList<BaseUnit> team) {

        super(5, 7, 1, name, x, y, team);
    }
}
