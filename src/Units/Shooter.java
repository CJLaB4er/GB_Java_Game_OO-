package Units;

public abstract class Shooter extends BaseUnit{
    // параметр ammunition отвечает за возможное кол-во выстрелов
    protected int ammunition;
    public Shooter(int maxHP, int initiative, String name, int ammunition) {
        super(maxHP, initiative, name);
        this.ammunition = ammunition;
    }
}
