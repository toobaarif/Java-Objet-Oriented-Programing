package com.company;
class Sphere{
    int radius;
    int height;
    public Sphere(int rad, int hei){
        this.radius = rad;
        this.height = hei;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double surfaceArea(){
        return  4* Math.PI * radius * radius;
    }
    public double volume(){
        return (4/3) * Math.PI *radius *radius* radius;
    }
}
public class A22_ps_constructor3 {
    public static void main(String[] args) {
        Sphere sp = new Sphere(3,4);
        System.out.println("Radius: "+sp.radius);
        System.out.println("Height: "+sp.height);

        System.out.println("Surface area: "+sp.surfaceArea());
        System.out.println("Volume: "+sp.volume());

    }

}
