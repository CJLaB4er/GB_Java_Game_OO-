package Units;

public class Coord {
    protected int x, y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getDistanse(Coord object) {
        float dx = object.x - this.x;
        float dy = object.y - this.y;
        return (float) (dx * dx + dy * dy);
    }

    public int[] getCoord() {
        return new int[]{this.x, this.y};
    }
}
