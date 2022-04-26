package com.company;

public class MethodTest_4 {
    //multi class call method
    public static void main(String[] args) {//main method
        Methods_3 obj=new Methods_3();  //object
        int a=2;
        int b=5;
        int c=obj.methodName(a,b);
        System.out.println(c);
        int a1=4;
        int b1=3;
        int c1=obj.methodName(a1,b1);
        System.out.println(c1);
        int e=20;
        int f=15;
        int g=obj.methodName(e,f);
        System.out.println(g);

    }
}
