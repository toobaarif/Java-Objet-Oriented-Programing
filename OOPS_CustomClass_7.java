package com.company;

/*class employee{                          //CLASS
    int id;
    String name;
    int salary;
    public void printDetail(){           //METHOD
       System.out.println("-My id is: "+id);
       System.out.println("-My name is: "+name);
        System.out.println("-My salary is: "+salary);
    }
}*/
public class OOPS_CustomClass_7 { //MAIN CLASS
    int id;
    String name;
    int salary;

    public void printDetail() {           //METHOD
        System.out.println("-My id is: " + id);
        System.out.println("-My name is: " + name);
        System.out.println("-My salary is: " + salary);
    }
    public static void main(String[] args) {//MAIN METHOD
        System.out.println("This is our custom class");
        OOPS_CustomClass_7 tooba=new OOPS_CustomClass_7();    //instantiating a new OBJECT
        OOPS_CustomClass_7 zaman=new OOPS_CustomClass_7();
        OOPS_CustomClass_7 obj = new OOPS_CustomClass_7();

        //setting attributes /properties tooba
        tooba.id=12;
        tooba.name="CodeWithTooba";
        tooba.salary=100000;

        //setting attributes /properties zaman
        zaman.name="zaman";
        zaman.id=13;
        zaman.salary=90000;

        //setting attributes /propertiesbina
        obj.name="bina";
        obj.id=10;
        obj.salary=1000;
        tooba.printDetail();
        zaman.printDetail();
        obj.printDetail();
    }
}
