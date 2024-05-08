package Week2;
    // two insance variables in class circle
    public class Circle{
        //two instance variables in class circle
    private double radius;
    private String color;
    
    private static final double pi = 3.14;
    
    //default
    //when you dont write your own constructor compiler adds one for you
    //no argument
    public Circle()
    {
        this.radius = 1.0;
        this.color = "red";
    }
    //parameterised
    public Circle(double r)
    {
        this.radius = r;
    }
    public Circle(String color)
    {
        this.color = color;
    }
    public Circle(double r, String c)
    {
        this.radius = r;
        this.color = c;
    }
    //copy constructor
    
    
    public double getRadius()
    {
        return this.radius;
    }
    public double getArea()
    {
        return (pi * this.radius*this.radius);
    }
    
    public String toString()
    {
        return("color = " + this.color + " and the radius = " + this.radius);
    
    }
    }
