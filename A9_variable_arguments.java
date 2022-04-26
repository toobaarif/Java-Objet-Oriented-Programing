package com.company;

public class A9_variable_arguments{
  /*  public static int tooba(int a, int b){
        return a+b;
    }

        public static int tooba(int a, int b, int c){
        return a+b+c;
    }

        public static int tooba(int a, int b, int c,int d){
        return a+b+c+d;
    }*/
    public static int tooba(int i ,int ...arguments){
        int sum=0;
        for (int element: arguments){
            sum=sum+element;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The addition of these numbers are: "+tooba(2));
        System.out.println("The addition of these numbers are: "+tooba(2,3));
        System.out.println("The addition of these numbers are: "+tooba(2,3,4));
        System.out.println("The addition of these numbers are: "+tooba(2,3,4,5));
    }

}
