package com.company;
//not completed
public class TypesOfMethod {
    //no parameter-->no return
    public void a () {
        int a=2; int b=5;
        System.out.println(a+b);
    }
    // parameter --->return
    public int  b(int a,int b) {
        int c=a+b;
        return c;
    }
    //parameter -->no return
    public int c(int a,int b){
        System.out.println(a-b);
        return a-b;
    }
    public static void main(String[] args) {
        TypesOfMethod obj=new TypesOfMethod();
      //  obj.a();
        System.out.println(obj.b(1,2));
        obj.c(4,2);

    }
}
