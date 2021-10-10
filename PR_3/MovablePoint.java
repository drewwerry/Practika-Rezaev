package PR_3;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "(x,y): ("+this.x+","+this.y+") speed: ("+xSpeed+","+ySpeed+")";
    }
    public void moveUp() {
        moveUp();
    }
    public void moveDown() {
        moveDown();
    }
    public void moveLeft() {
        moveLeft();
    }
    public void moveRight() {
        moveRight();
    }
}
