public class MobileHome extends Building implements Moveable {
    @Override
    public void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }
}
