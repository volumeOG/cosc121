public abstract class Shape implements Comparable<Shape>,Cloneable{
    //attributes
    private String color;
    private boolean filled;
    //constructors
    protected Shape(){this("White", true);}
    protected Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }
    //methods
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public boolean isFilled(){return filled;}
    public void setFilled(boolean f){filled = f;}
    public String toString(){
        return "Color: " + color + ". " + (filled? "Filled. ":"Not filled. ");
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public int compareTo(Shape shp){
        if(this.getArea() == shp.getArea()) return 0; // objects are equal
        else if(this.getArea() > shp.getArea()) return 1;
        else return -1;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
