package com.company;
//        problem: 1
class Cylinder {
  private int radius;
   private int height;
   public Cylinder(int rad, int hei){
       this.radius = rad;
       this.height = hei;
   }

//    public void setRadius(int r){
//        this.radius = r;
//    }
//    public void setHeight(int h){
//        this.height = h;
//    }
public int getRadius(){
    return radius;
}
    public int getHeight(){
        return height;
    }
    public double surfaceArea(){
        return 2 * Math.PI* radius* radius + 2* Math.PI* radius* height;
    }
    public double volume(){
        return Math.PI * radius * radius* height;
    }
}


//        problem: 2
public class A21_ps_constructor {
    public static void main(String[] args) {
//        problem: 1
        Cylinder myCylinder = new Cylinder(9,12);

//        myCylinder.setHeight(12);
        System.out.println("Height :"+ myCylinder.getHeight());

//        myCylinder.setRadius(9);
        System.out.println("Radius: "+ myCylinder.getRadius());

        System.out.println("Surface Area: "+myCylinder.surfaceArea());
        System.out.println("Volume: "+myCylinder.volume());

        //        problem: 2

    }
}
