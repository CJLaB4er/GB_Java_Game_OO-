package Units;

public class Coord {
    protected int x, y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getDistanse(Coord unit) {
        float dx = unit.x - this.x;
        float dy = unit.y - this.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public int[] getCoord() {
        return new int[]{this.x, this.y};
    }
}
