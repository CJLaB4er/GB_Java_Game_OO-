package Units;

public class Coord {
    protected int x, y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getCoord(Coord object) {
        float dx = object.x - this.x;
        float dy = object.y - this.y;
        return (float) (dx * dx + dy * dy);
    }

    public int[] getXY(Coord object) {
        return new int[]{this.x, this.y};
    }
}
