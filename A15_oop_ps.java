package com.company;

public class A15_oop_ps {
    //attributes/ properties
          int id;
          String name;
            int salary;
          public void update(){
              System.out.println("Id: "+id);
              System.out.println("Name: "+name);
              System.out.println("salary: "+salary);
          }
//          public  int getSalary(){
//              return salary;
//          }

    public static void main(String[] args) {
        A15_oop_ps obj= new A15_oop_ps();
        obj.id= 101;
        obj.name="Tooba";
        obj.salary=90000;
//        int salary= obj.getSalary();

        A15_oop_ps fiba= new A15_oop_ps();
        fiba.id=102;
        fiba.name="fiba";
        fiba.salary=20000;


        obj.update();
        fiba.update();


//        System.out.println(salary);
//        System.out.println("ID: "+obj.id);
//        System.out.println("Name: "+obj.name);

    }

    }

