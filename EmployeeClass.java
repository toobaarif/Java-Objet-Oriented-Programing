package com.company;

public class EmployeeClass {
    //  property
    String name;
    int salary;
    int id;
    //set snd get methods
    public void setName(String n){

        name =n;
    }
    public String getName() {

        return name;
    }
    public void setSalary(int s) {
        salary=s;
    }
    public int getSalary() {
        return salary;
    }
    public void setId(int i) {
        id=i;
    }
    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        EmployeeClass obj= new EmployeeClass();//object

        obj.setName("tooba");
        System.out.println("-My name is: "+obj.getName());
        obj.setSalary(100000);
        System.out.println("-My salary is: "+obj.getSalary());
        obj.setId(101);
        System.out.println("-my id is: "+obj.getId());

        obj.setName("nancy");
        System.out.println("-My name is: "+obj.getName());
        obj.setSalary(1000);
        System.out.println("-My salary is: "+obj.getSalary());
        obj.setId(201);
        System.out.println("-my id is: "+obj.getId());

    }
}
