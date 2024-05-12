package Week2;

public class Rectangle {
    private float length;
    private float width;

    // no arguement
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    // para
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    //GETTER AND SETTER
    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return this.length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return this.width;
    }

    public double getArea() {
        return (this.length * this.width);
    }

    public double getPermeter() {
        return (2 * (this.length + this.width));
    }

    public String toString() {
        return("(Length = " + this.length + ")" + "(Width = " + this.width + ")");
    }

}
