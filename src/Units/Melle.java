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
            // смещение для разных команд
            if (dy < 0) {
                // проверяем, что ячейка не занята союзником
                if (cellIsEpty(this.coord.x, this.coord.y + 1)) {
                    this.coord.y++;
                }
            } else {
                if (cellIsEpty(this.coord.x, this.coord.y - 1)) {
                    this.coord.y--;
                }
            }

        } else {
            if (dx < 0) {
                if (cellIsEpty(this.coord.x + 1, this.coord.y)) {
                    this.coord.x++;
                }
            } else {
                if (cellIsEpty(this.coord.x - 1, this.coord.y)) {
                    this.coord.x--;
                }
            }

        }
    }


    protected boolean cellIsEpty(int x, int y) {
        for (BaseUnit unit : team) {
            if (unit.coord.x == x && unit.coord.y == y) return false;
        }
        return true;
    }

}
