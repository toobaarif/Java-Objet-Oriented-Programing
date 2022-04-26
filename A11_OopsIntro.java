package com.company;
class birds{
    public void fly(){
        System.out.println("I am flying");
    }
}

public class A11_OopsIntro { //class
    public void eat() {      //method
        System.out.println("i m eating");
    }

    public void run() {
        System.out.println("I am running! ");
    }

    public void bark() {
        System.out.println("Dog id barking ");
    }

    public void sleep() {
        System.out.println("I am sleeping ");
    }


    public static void main(String[] args) {
        A11_OopsIntro dog = new A11_OopsIntro(); //object
        dog.eat();
        dog.run();
        dog.bark();
        dog.sleep();
        birds sp=new birds();
        sp.fly();


}
}
