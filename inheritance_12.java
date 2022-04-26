package com.company;

//make a class dont use acces modi(default) in same package
 class base{
    int x;

public void print(){  //method
    System.out.println("I am a data of class base: ");
   }
   public void setX(int x){
   this.x=x;
   }
   public int getX(){
    return x;
   }
}
//when we need to get data of base class so we can use constructor keyword (extends classname)
class derived extends base{
     public void prnt(){
         System.out.println("I am a data of class derived which extends to data class: ");
     }
     int y;
     public void setY(int y){
         this.y=y;
     }
     public int getY(){
         return y;
     }
}


public class inheritance_12 {
    public static void main(String[] args) {
        //obj of base class access x
        base b=new base();
        b.print();
        b.setX(4);
        System.out.println("X= "+ b.getX());

        //obj of derivative class where we access x and y
        derived d=new derived();
        d.prnt();
        d.setX(5);
        System.out.println("X= "+d.getX());
        d.setY(7);
        System.out.println("Y="+d.getY());
        d.print();
    }
}
