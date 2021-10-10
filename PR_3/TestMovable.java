package PR_3;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(1, 2 ,2, 2);
        MovableCircle m2 = new MovableCircle(1, 2 ,2, 2);
        MovableRectangle m3 = new MovableRectangle( 1,2,3,4,5,6);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
