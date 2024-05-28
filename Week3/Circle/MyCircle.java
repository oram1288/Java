package Circle;

public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle(){
        this.center = new MyPoint();
        this.radius = 1;
    }

    public MyCircle(int x, int y, int r){
        this.center = new MyPoint(x,y);
        this.radius = r;
    }

    public MyCircle(MyPoint p, int r){
        this.center = p;
        this.radius = r;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return this.center.getX();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int getCenterY(){
        return this.center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }

    public int[] getCenterXY(){
        int[] XY={this.center.getX(), this.center.getY()};

        return XY;
    }

    public String toString(){
        return ("Center = " + this.center + " , Radius = " + this.radius);
    }

    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }

    public double getCircumference(){
        return (2 * Math.PI * this.radius);
    }

    public double distance(MyCircle c){
        return (this.center.distance(c.center));
    }
}
