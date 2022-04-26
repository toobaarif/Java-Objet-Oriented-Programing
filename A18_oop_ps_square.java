package com.company;

public class A18_oop_ps_square {
    int side;

public int area(){
    return side*side;
}
public int perimeter(){
    return 4*side;
}

    public static void main(String[] args) {
        A18_oop_ps_square sq = new A18_oop_ps_square();
        sq.side = 8;
        System.out.println("Side: "+sq.side);
        System.out.println("Area: "+sq.area());
        System.out.println("Perimeter: "+sq.perimeter());
    }
}
