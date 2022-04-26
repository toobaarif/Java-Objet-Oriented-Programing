package com.company;

public class methodPS_5 {
    //q no 1
    public void table(int n) {
        System.out.println("---The Table---");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
    //q no 2
    public void pattern(int n){
        for (int i=1; i<=n;i++){
            for (int b=1; b<=i; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        methodPS_5 obj= new methodPS_5();
        //q no 1
//        obj.table(20);
        //q no 2
//        obj.pattern(9);
    }
}
