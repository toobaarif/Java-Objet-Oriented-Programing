package com.company;

class class1{   //class
    public void method1(){
        System.out.println("I am method 1 of class 1");
    }
    public int methtooba(){
        return 4;
    }
}

class class2 extends class1{
    @Override
    public void method1(){
        System.out.println("I am method 2 of class 2");
    }
    public void method2(){
        System.out.println("I am method 2 of class 2");
    }
}
public class MethodOverriding_15 {
    public static void main(String[] args) {
        class1 object= new class1();
        object.method1();
        System.out.println(object.methtooba());

        class2 obj=new class2();
        obj.method1();
        System.out.println(obj.methtooba());

    }
}
