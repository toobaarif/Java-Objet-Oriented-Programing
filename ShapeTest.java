class Shape{
String color;
boolean filled;
 Shape (){

}
 Shape (String color, boolean filled){
this.color = color;
this.filled = filled;
}
public boolean isFilled(){
return filled;
}
public void setColor(String color){
this.color = color;
}
public String getColor(){
return color;
}
public void setFilled(boolean filled){
this.filled = filled;
}
public boolean getFilled(){
return filled;
}
public String toString(){
return "Color: "+getColor()+"\nFilled: "+getFilled();
}
}

class Circle1 extends Shape{
double radius;
 Circle1(){
}
 Circle1(double radius){
this.radius = radius;
}
 Circle1(double radius, String color, boolean filled){
this.radius = radius;
this.color = color;
this.filled = filled;
}
public void setRadius(double radius){
this.radius = radius;
}
public double getRadius(){
return radius;
}
public double getArea(){
return 3.142 * radius * radius;
}
public double getPerimeter(){
return  2* 3.142* radius;
}
public String toString(){
return "Radius: "+getRadius()+"\nColor: "+getColor()+"\nFilled: "+getFilled()+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
}
} 



class Rectangle extends Shape{
double width;
double length;
 Rectangle(){

}
 Rectangle(double width, double length){
this.width = width;
this.length = length;
}
 Rectangle(double width, double length, String color, boolean filled){
this.width = width;
this.length = length;
this.color = color;
this.filled = filled;
}
public void setWidth(double width){
this.width = width;
}
public double getWidth(){
return width;
}
public void setLength(double length){
this.length = length;
}
public double getLength(){
return length;
}
public double getArea(){
return  length * width;
}
public double getPerimeter(){
return 2* (length + width);
}
public String toString(){
return "Width: "+getWidth()+"\nLength: "+getLength()+"\nColor: "+getColor()+"\nFilled: "+getFilled();
}
}

class Square extends Rectangle {
double side;
Square(){

}
 Square(double side){
this.side = side;
}
Square (double side, String color, boolean filled){
this.side = side;
this.color = color;
this.filled = filled;
}
public void setSide(double side){
this.side = side;
}
public double getSide(){
return side;
}
public void setWidth(double side){
this.side = side;
}
public void setLength(double side){
this.side = side;
}
public String toString(){
return "Color: "+getColor()+ "\nFilled: "+getFilled()+"\nSide: "+getSide();
}

}
class ShapeTest{
public static void main(String args[]){
 	
System.out.println("CIRCLE");
Circle1 c = new Circle1(1.0, "Blue", true);
System.out.println(c.toString());


System.out.println("RECTANGLE");
Rectangle r = new Rectangle(1.0, 1.0, "red", true);
System.out.println(r.toString());

System.out.println("SQUARE");
Square s = new Square(4.0, "green", true);
System.out.println(s.toString());






}
}