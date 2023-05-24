package Units;

public class Peasant extends BaseUnit {
    /*
    Создание юнита "Крестьянин", параметр "name" передаётся при создании объекта,
    остальные параметры передаются через конструктор в базовый класс.
     */
    public Peasant(String name) {
        super(5, 7, name);
    }
}
