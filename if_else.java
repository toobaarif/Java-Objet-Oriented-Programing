package com.company;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---YOUR RESULT---");
        System.out.println("english");
        int eng=sc.nextInt();
        System.out.println("programing");
        int pro=sc.nextInt();
        System.out.println("ICT");
        int ict=sc.nextInt();
        float ave=(eng+pro+ict)/3.0f;
        System.out.println("your average is: "+ave);
        float per=((eng+pro+ict)/300.0f)*100;
        System.out.println("your percentage is: "+per);
        if (ave>=40 && eng>=33 && pro>=33 && ict>=33){
            System.out.println("congratulation you are passed!");
        }else {
            System.out.println("sorry, you are fail!");
        }
    }
}
