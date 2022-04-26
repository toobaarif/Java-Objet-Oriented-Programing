package com.company;
class angels{
    String name;
    int Class;
    public void info(String n, int C){
        name=n;
        Class=C;
    }
    public void dis(){
        System.out.println(name);
        System.out.println(Class);
    }

}
class human{
    String name;
    int age;
    public void  methodName(String n, int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class A13_oopByusingmethod {
    public static void main(String[] args) {
     human object= new human();
     object.methodName("Tooba",102);
     object.display();

     angels obj=new angels();
     obj.info("loren",2);
     obj.dis();
    }
}
