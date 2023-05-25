package Units;

public abstract class Magic extends BaseUnit{
    int mp, maxMp;

    public Magic(int maxHP, int initiative, int damage, String name, int mp, int maxMp) {
        super(maxHP, initiative, damage, name);
        this.mp = mp;
        this.maxMp = maxMp;
    }
}
