package Units;

public class Shooter extends BaseUnit{
    protected int ammunition;
    public Shooter(int maxHP, int initiative, String name, int ammunition) {
        super(maxHP, initiative, name);
        this.ammunition = ammunition;
    }
}
