public class Circle extends Shape {
    private double radius;

    public Circle() {this(1);}
    public Circle(double radius){
        setRadius(radius);
    }

    public void setRadius(double radius) {this.radius = radius;}
    public double getradius() {return radius;}
    public double getDiameter() {return 2*radius;}

    public double getArea() {return Math.PI * radius * radius;}
    public double getPer(){ return 2 * Math.PI * radius;}

    public String toString(){
        return "Circle: Color: " + getColor() + ". Filled: " + isFilled() + ". Radius: " + radius;
    }
}
