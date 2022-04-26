package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("--percentage calculation--");
        System.out.println("chemistry");
        int s1= sc.nextInt();
        System.out.println("english");
        int s2=sc.nextInt();
        System.out.println("bio");
        int s3=sc.nextInt();
        System.out.println("programming");
        int s4=sc.nextInt();
        System.out.println("ict");
        int s5=sc.nextInt();
        float totalMarks=500.0f;
        float per=((s1+s2+s3+s4+s5)/totalMarks)*100;
        System.out.println("percentage-->"+per);
    }
}
