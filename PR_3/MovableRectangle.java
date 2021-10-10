package PR_3;

public class MovableRectangle implements Movable{
    private int x1,x2;
    private int y1,y2;
    private int xSpeed;
    private int ySpeed;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1,int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2= y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "(x1,y1): ("+this.x1+","+this.x1+") (x2,y2): ("+this.x2+","+this.y2+") xSpeed: "+this.xSpeed+" ySpeed: "+this.ySpeed;
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