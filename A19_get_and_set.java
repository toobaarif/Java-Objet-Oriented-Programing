package com.company;
class MyEmployee{
    private String name;
    private int id;

    //    getters ane setters in method
    public void setName(String n){
        name =n ;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public  int getId(){
        return id;
    }

}
public class A19_get_and_set {

    public static void main(String[] args) {
    MyEmployee obj = new MyEmployee();
        obj.setName("Tooba");
        System.out.println(obj.getName());
        obj.setId(101);
        System.out.println(obj.getId());

//         obj.name= "Tooba";
//        System.out.println(obj.name);
//        obj.id = 101;
//        System.out.println(obj.id);
    }
    }
