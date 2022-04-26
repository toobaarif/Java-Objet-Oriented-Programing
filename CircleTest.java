class Circle{
 double radius;
 String color;

public Circle(){

}
public Circle (double radius){
this.radius = radius;
}
public Circle(double radius, String color){
this.radius = radius;
this.color = color;
}

public void setRadius(double radius){
this.radius = radius;
}
public double getRadius(){
return radius;
}
public void setColor(String color){
this.color = color;
}
public String getColor(){
return color;
}

public double getArea(){
return 3.142  * radius * radius;
}
public String toString(){
return "Radius = "+getRadius()+"/nColor of cicle is: "+getColor()+"/nArea of Cicle is: "+getArea();
}
}

class Cylinder extends Circle{
 double height;
public Cylinder(){
}
public Cylinder(double radius){
this.radius = radius;
}
public Cylinder(double radius, double height){
this.radius = radius ;
this.height = height;
} 
public Cylinder(double radius, double height, String color){
this.radius = radius ;
this.height = height;
this.color = color;
} 


public void setHeight(double height){
this.height = height;
}
public double getHeight(){
return height;
}

public double getVolume(){
return 3.142 * radius * radius *height;
}
}

class CircleTest{
public static void main(String args []){

        // we can also initialize value through parameterized constructor

//  Initialize through parameter because of String toString Method
Cylinder tooba = new Cylinder(1.0,1.0,"Yellow");

System.out.println("Radius of circle from inherit class: "+tooba.radius);

System.out.println("Height of circle from inherit class: "+tooba.getHeight());

System.out.println("Color of circle from inherit class: "+tooba.color);

System.out.println("Height of cylinder is: "+tooba.getArea());
System.out.println("Volume of Cylinder is: "+tooba.getVolume());
}
}



