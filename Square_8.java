package com.company;

public class Square_8 {
    int side;
    public int area(){
        return side * side ;
    }
    public int perimeter(){
        return  4*side;
    }

    public static void main(String[] args) {
        Square_8 sq= new Square_8();
        sq.side=6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
