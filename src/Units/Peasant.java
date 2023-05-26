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

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        super.step(enemys);
        ArrayList<BaseUnit> teamShooter = new ArrayList<>();
        if (!this.die()) {
            for (BaseUnit unit : this.team) {
                if (unit instanceof Shooter) teamShooter.add(unit);
            }
            Shooter target = (Shooter) findTarger(teamShooter);
            if (target != null && target.ammunition < target.maxAmmunition) {
                target.ammunition++;
            }
        }
    }
}
