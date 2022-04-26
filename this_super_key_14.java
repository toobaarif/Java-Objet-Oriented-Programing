package com.company;

public class this_super_key_14 {//class
    int num;
    public this_super_key_14(int num){//Overloaded constructor,set
        this.num=num;
          //if we dont add this so there is nothing to print
    }
    public int getNum(){//getter
        return num;
    }

    //Super keyword
    class SuperClass extends this_super_key_14{
        SuperClass(int c){
            super(c);
            System.out.println("I am a constructor ");

        }

    }

    public static void main(String[] args) {
        this_super_key_14 object= new this_super_key_14(24);
    //   SuperClass s=new SuperClass(4);
        System.out.println(object.getNum());

    }
}
