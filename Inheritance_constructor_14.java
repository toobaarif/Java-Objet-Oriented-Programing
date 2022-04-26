package com.company;

class grandpa{
    public grandpa(){
        System.out.println("I am a grandpa cons");
    }
    public grandpa(int a){  //argument constructor
        System.out.println("i m an overloaded grandpa cons "+a);
    }
}
    class parent extends grandpa{
        public parent (){
            System.out.println("I am parent cons");
        }
        public parent (int a,int b){ //parents argument constructor
            super(a);
            System.out.println("i m an overloaded cons parents "+b);
        }
        }
        class child extends parent{
    public child(){
        System.out.println("i m a child constructor");
    }
            public child (int a,int b, int c){  //parent argument constructor
                super(a,b);
                System.out.println("i m an overloaded child cons");
        }
}

public class Inheritance_constructor_14 {
    public static void main(String[] args) {
        grandpa g=new grandpa(3);
        parent p= new parent();
        child c= new child();
    }
}
