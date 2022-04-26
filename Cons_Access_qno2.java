package com.company;

public class Cons_Access_qno2 {
    int height;
    int radius;
    public Cons_Access_qno2(int h,int r){
        height=h;
        radius=r;
    }
    public int getHeight(){
        return height;
    }
    public int getRadius(){
        return radius;
    }public double surfaceArea(){
        return 2*3.142*radius*radius + 2*3.142*radius*height;
    }
    public double volume(){
        return  Math.PI*radius*radius*height;
    }

    public static void main(String[] args) {
    Cons_Access_qno2 object=new Cons_Access_qno2(9,12);
        System.out.println("Height: "+object.getHeight());
        System.out.println("Radius: "+ object.getRadius());

        System.out.println("Area of cylinder: "+object.surfaceArea());
        System.out.println("Volume of cylinder: "+object.volume());
    }
}
