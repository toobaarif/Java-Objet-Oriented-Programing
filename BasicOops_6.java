package com.company;

public class BasicOops_6 {
   private int id;
    private   String name;
    public int a(){
        return 1;
    }

    public static void main(String[] args) {
        BasicOops_6 obj= new BasicOops_6();
        obj.id=102;
        obj.name="tooba";
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.a());

    }
}
