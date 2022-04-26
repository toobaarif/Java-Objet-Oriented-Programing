package com.company;

//private access modifier
public class AccessModifier_10 {
    private int id;
    private String name;
    private int  salary;
  /*  public void printDetail(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }*/

    public void setName(String n){
        name =n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }public void setSalary(int s){
        salary=s;
    }
    public int getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        AccessModifier_10 obj=new AccessModifier_10();
        obj.setName("tooba");
        System.out.println(obj.getName());
        obj.setId(102);
        System.out.println(obj.getId());
        obj.setSalary(200000);
        System.out.println(obj.getSalary());
          //obj.printDetail();
          //obj.setName("laiba")
          //obj.setId(102);
          //obj.setSalary(1000);
          // obj.printDetail();
    }
}
