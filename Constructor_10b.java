package com.company;

public class Constructor_10b {
    private int id;
    private String name;

    // For CONSTRUCTOR just access modi and class name constructor me prop set kye hn set krne ki need ni
   ////constructor like setter
      public Constructor_10b(){
        id=45;
       name ="CodeWithTooba";
    }

    //We also set arguments in constructor like id name like "constructor overloading".   id or salary object me dengy
    public Constructor_10b(int myId,String myName){
     id=myId;
    name=myName;
    }

//    public void setId(int i){
//       id=i;
//    }
    public int getId(){
        return id;
    }
//    public void setName(String n){
//        name=n;
// }
    public String getName(){
        return name;
    }

    public static void main(String[] args){
        Constructor_10b object= new Constructor_10b(3,"tooba");
       ///object.setId(102);
       System.out.println(object.getId());

        //object.setName("tooba");
        System.out.println(object.getName());


    }
}
