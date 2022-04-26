package com.company;

public class A8_method_overloading {
    // Method overloading: same method name different work
    //also types of method
    //method 1: no parameter --> no return
    public static void foo(){
        System.out.println("Good morning bro!");
    }
    public static void foo(int a, int b){
        System.out.println("Good morning "+a+" bro "+b);
    }
    public static void foo(int a, int b, int c){
        System.out.println(a +" this is a "+b+" this is b"+c+" this is c");
    }
    //method 2: parameter --> return
    public static int tooba( int a, int b){
        int c=a+b;
        return c;
    }
    //method 3: no parameter --> return
    public static  int laiba(){
        System.out.println("The sum of a and b is: ");
        int a=1;
        int b=2;
        int c=a+b;
        return c;
    }
    //method 4: parameter --> no return
    public static void marwa(int a, int b){
        int c=a+b;
        System.out.println(c);
    }




    public static void main(String[] args) {
        A8_method_overloading object= new A8_method_overloading();
       foo();
       foo(23,56 );
       foo(1, 2,3);
        System.out.println( object.tooba(10,5));
        System.out.println(object.laiba());
        object.marwa(9,6);

    }
}
