package Units;

import java.util.ArrayList;

public abstract class Melle extends BaseUnit {
    public Melle(int maxHP, int initiative, int damage, String name, int x, int y, ArrayList<BaseUnit> team) {
        super(maxHP, initiative, damage, name, x, y, team);
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        super.step(enemys);
        if (!this.die()) {
            BaseUnit target = findTarger(enemys);
            if (target != null) {
                if (target.coord.getDistanse(this.coord) < 2) target.hp = target.hp - this.damage;
                else move(target);
            }
        }
    }

    protected void move(BaseUnit target) {
        // находим расстояние по X и Y координатам
        float dx = this.coord.getCoord()[0] - target.coord.getCoord()[0];
        float dy = this.coord.getCoord()[1] - target.coord.getCoord()[1];

        // ищем короткий путь
        if (Math.abs(dy) > Math.abs(dx)) {
            moveY(dx, dy, true);
        } else {

            moveX(dx, dy, true);
        }
    }


    protected boolean cellIsEpty(int x, int y) {
        for (BaseUnit unit : team) {
            if (unit.coord.x == x && unit.coord.y == y && !unit.die()) return false;
        }
        return true;
    }

    protected void moveX(float dx, float dy, boolean flag) {
        if (flag) {
            if (dx < 0) {
                if (cellIsEpty(this.coord.x + 1, this.coord.y)) {
                    this.coord.x++;
                } else moveY(dx, dy, false);
            } else {
                if (cellIsEpty(this.coord.x - 1, this.coord.y)) {
                    this.coord.x--;
                } else moveY(dx, dy, false);
            }
        }
    }

    protected void moveY(float dx, float dy, boolean flag) {
        if (flag) {
            if (dy < 0) {
                if (cellIsEpty(this.coord.x, this.coord.y + 1)) {
                    this.coord.y++;
                } else moveX(dx, dy, false);
            } else {
                if (cellIsEpty(this.coord.x, this.coord.y - 1)) {
                    this.coord.y--;
                } else moveX(dx, dy, false);
            }
        }
    }
}
