package com.company;

class Animal{//class
    String g;
    public void cat(){
        System.out.println("cat is an animal.");
    }
    public void cow (){
        System.out.println("cow is an animal.");
    }
    public void setG(String g){
        this.g=g;
    }
    public String getG(){
        return g;
    }
}

class Dog extends Animal{ //another class which extends to animal class
    public void dog(){
        System.out.println("dog is an animal.");
    }
}
public class Inheritance2_13 {
    public static void main(String[] args) {
        //creating obj of animal class
        Animal object = new Animal();
        object.cat();
        object.cow();
        object.setG("goat");
        System.out.println(object.getG());

        //creating obj of dog class which also access animal class prop
        System.out.println("--Dog class obj--");
        Dog obj=new Dog();
        obj.dog();
        obj.cat();
        obj.cow();
        obj.setG("goat");
        System.out.println(object.getG());
    }
}
