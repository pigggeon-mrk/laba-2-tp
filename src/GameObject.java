public abstract class GameObject {
    private int ID;
    private String Name;
    private int X;
    private int Y;

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getY() {
        return Y;
    }
}
