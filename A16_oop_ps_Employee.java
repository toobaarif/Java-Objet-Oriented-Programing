package com.company;

public class A16_oop_ps_Employee {
        int salary;
        String name;

        public int getSalary(){
            return salary;
        }
        public void setName(String n){
            name=n;
        }
        public String getName(){
            return name;
        }

    public static void main(String[] args) {
      A16_oop_ps_Employee object = new A16_oop_ps_Employee();

      object.salary=20000;
        System.out.println("Salary: "+object.getSalary());

      object.setName("CodeWithTooba");
        System.out.println("Name: "+object.getName());

    }
}
