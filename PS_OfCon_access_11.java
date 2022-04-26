package com.company;

public class PS_OfCon_access_11 {
    int height;
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    //find Surface Area..
    public double surfaceArea(){
        return 2*3.142*radius*radius + 2*3.142*radius*height; //formula of surface area
    }
    //find volume...
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    //also use another class
    public static void main(String[] args) {
        PS_OfCon_access_11 cylinder=new PS_OfCon_access_11();

        cylinder.setHeight(12);
        System.out.println("Height: " +cylinder.getHeight());
        cylinder.setRadius(9);
        System.out.println("Radius: "+cylinder.getRadius());

        //through formula
        System.out.println("Surface area of cylinder: "+ cylinder.surfaceArea());
        System.out.println( "Volume of cylinder: "+ cylinder.volume());

    }
}
