public class MyPoint<T>
{
    private T x;
    private T y;

    public MyPoint()
    {
        this.x = null;
        this.y = null;

    }
    public MyPoint(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
    public void setX(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }
    public void setY(T y) {
        this.y = y;
    }
    public T getY() {
        return y;
    }

    public void setXY(T x, T y)
    {
        this.x = x;
        this.y = y;

    }

    public String toString()
    {
        return ("("+this.x + "," + this.y + ")");
    }


}