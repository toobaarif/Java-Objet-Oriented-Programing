package com.company;

public class Methods_3 {       //class
    public static int methodName(int x,int y){//method
        //logic which apply many times by DRY principle
        int z;
        if(x<y){
             z=x+y;
        }else {
            z=x-y;
        }
        return z;
    }
    public static void main(String[] args) {//main method
        Methods_3 obj=new Methods_3();  //object
        int a=2;
        int b=5;
        int c=obj.methodName(a,b);
        System.out.println(c);
        int a1=4;
        int b1=3;
        int c1=methodName(a1,b1);
        System.out.println(c1);
        int e=20;
        int f=15;
        int g=obj.methodName(e,f);
        System.out.println(g);


    }
}
