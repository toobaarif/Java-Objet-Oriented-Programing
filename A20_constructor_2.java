package com.company;
class Constructors{
    private String name;
    private int id;

//   1: Constructor
    public Constructors(){
        id = 4;
        name = "Your NameHere ";
    }
//  2:  Argument constructor also a constructor overloading because same name and different args
    public Constructors(String myname, int myid){
           this.name=myname;
           this.id=myid;
    }


//    method for setting
//    public void setName(String n){
//        name = n;
//    }
//    public void setId(int i){
//        id = i;
//    }
//    method for getting
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class A20_constructor_2 {

    public static void main(String[] args) {
       Constructors object = new Constructors("Tooba", 102);
//       setting
//        object.setName("CodeWithTooba");
//        object.setId(101);

//        getting
        System.out.println(object.getName());
        System.out.println(object.getId());


    }
}
