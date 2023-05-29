package Units;

import java.util.ArrayList;

public abstract class Melle extends BaseUnit{
    public Melle(int maxHP, int initiative, int damage, String name, int x, int y, ArrayList<BaseUnit> team) {
        super(maxHP, initiative, damage, name, x, y, team);
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        super.step(enemys);
        BaseUnit target = findTarger(enemys);
        if (target != null){
            move(target);
        }
    }

    protected void move(BaseUnit target){
        float dx = this.coord.getCoord()[0] - target.coord.getCoord()[0];
        float dy = this.coord.getCoord()[1] - target.coord.getCoord()[1];
        if (dx < dy){
            this.coord.x ++;
        }
        else {
            this.coord.y ++;
        }

    }
}
