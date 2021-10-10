package PR_3;

public class Square extends Rectangle{
    private double side;
    public Square(){
        this.side = 4;
        this.color = "green";
        this.filled = true;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    double getSide(){
        return side;
    }
    void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side){
        this.side = side;
    }
    public void setLength(double side){
        this.side = side;
    }
    public String toString(){
        return "Shape: square, side: "+this.side+", color: "+this.color+", filled: "+this.filled;
    }
}
