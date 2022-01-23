package DataStructure.WordGrid;

public class Vector {
    private int x, y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEqual(Vector other) {
        return this.getX() == other.getX() && this.getY() == other.getY();
    }

    public Vector add(Vector other) {
        return new Vector(this.getX() + other.getX(), this.getY() + other.getY());
    }

    public void increment(Vector other) {
        this.setX(this.getX() + other.getX());
        this.setY(this.getY() + other.getY());
    }
}