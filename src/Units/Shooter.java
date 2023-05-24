package Units;

public abstract class Shooter extends BaseUnit{
    // параметр ammunition отвечает за возможное кол-во выстрелов
    protected int ammunition;
    public Shooter(int maxHP, int initiative, int damage, String name, int ammunition) {
        super(maxHP, initiative, damage, name);
        this.ammunition = ammunition;
    }

    @Override
    public void step() {
        super.step();
        if (!die){

        }
    }
}
