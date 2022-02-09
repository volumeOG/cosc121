public class Hexagon extends Shape{

    private double area;
    private double perimeter;
    private String color;
    private boolean filled;
    //constructors
    public Hexagon(){}
    //getters
    public double getArea(){return area;}

    public double getPerimeter(){return perimeter;}
    public String getColor(){return color;}
    public boolean isFilled(){return filled;}

    //setters
    public void setArea(int newArea){this.area = newArea;}
    public void setPerimeter(int newPerimeter){this.perimeter = newPerimeter;}
    public void setColor(String newColor){this.color = newColor;}

    @Override
    public String toString(){return "Area: " + area + ". perimeter: " + perimeter + ". color: " + color + (filled ? ". Filled. " : ". Not Filled.") ;}
}
/*
class requirements:

setter and getter methods
constructors
override toString to return a string representation of
all attribute values as well as the area and perimeter of a
hexagon object.
 */