package com.company;

public class A10_method_practice {
      //problem 1
    public static void table(int tabl, int n){
        for (int i=1; i<=n; i++){
            System.out.printf("%d X %d = %d\n",tabl,i,tabl*i);
        }
    }
    //problem 2
    public static void star(int n){
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //problem 3
    public static int varArgs(int ...arguments){
        int multiply=1;
        for (int element : arguments){
            multiply=multiply*element;
        }
        return multiply;
    }
    //problem 4, addition of first n natural numbers
     public static int sumRec(int n){
        //Base condition
        if (n==1){
            return 1;
        }
        return n+sumRec(n-1);
     }

    public static void main(String[] args) {
        A10_method_practice object= new A10_method_practice();
        //problem 1
        // object.table(5,10);

        //problem 2
       // object.star(5);

        //problem 3
        System.out.println("The addition of these numbers are: "+varArgs(2));
        System.out.println("The addition of these numbers are: "+varArgs(2,3));
        System.out.println("The addition of these numbers are: "+varArgs(2,3,4));
        System.out.println("The addition of these numbers are: "+varArgs(9,2,3,4,5));
        
        //problem 4
//      int c= sumRec(4);
  //      System.out.println(c);


    }
}
