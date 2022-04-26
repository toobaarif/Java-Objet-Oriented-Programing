package com.company;

public class A14_constructor {
    String name;
    int id;
    public A14_constructor(String name, int id){
    this.name=name;
    this.id=id;
    }
    public static void main(String[] args) {
        A14_constructor e1= new A14_constructor("Tooba",101);
        A14_constructor e2= new A14_constructor("Kainat",102);
        System.out.println("Employee 1: "+ e1.name+" Employee id: "+e1.id);
        System.out.println("Employee 2: "+ e2.name+" Employee id: "+e2.id);

    }

}

//type of constructor default(by compiler), by user no arg and with arguments
  /*  public A14_constructor(int a){
        System.out.println("no args constructor");
    }
    public static void main(String[] args) {
        A14_constructor object= new A14_constructor(10);
    }
    }
   */


