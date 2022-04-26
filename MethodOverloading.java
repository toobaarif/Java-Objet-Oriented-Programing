package com.company;

//same name of class different parameters

public class MethodOverloading {
    public void methodName(){
        System.out.println("good morning bro!");
    }
    public void methodName(int a){
        System.out.println("good morning " +a+" bro");
    }
    public void methodName(int a,int b){
        System.out.println("your name "+a+ " bro! "+b);
    }

        public static void main(String[] args) {
        MethodOverloading obj= new MethodOverloading();
        obj.methodName();
        obj.methodName(300);
        obj.methodName(200,14);

    }
}
