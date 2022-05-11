package module4.hw4;

import java.util.Objects;

class StarTrack {
    private Point start;
    private Point finish;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarTrack starTrack = (StarTrack) o;
        return Objects.equals(start, starTrack.start) && Objects.equals(finish, starTrack.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }
}

public class Point {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y &&
                z == point.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
class PointTest {
    public static void main(String[] args)  {
        //throws NullPointerException
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Will be false
        System.out.println(p1.hashCode() == p2.hashCode());

        StarTrack track1 = new StarTrack();
        StarTrack track2 = new StarTrack();
        StarTrack track3 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p2);

        track2.setStart(p1);
        track2.setFinish(p2);

        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println(track1.equals(track2));
        System.out.println(track1.equals(track3));
        System.out.println(track1.hashCode() == track2.hashCode());
        System.out.println(track1.hashCode());
    }
}