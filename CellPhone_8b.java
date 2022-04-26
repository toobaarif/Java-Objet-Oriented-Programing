package com.company;

public class CellPhone_8b {
    public void ringing(){
        System.out.println("ting tong...");
    }
    public void vibrating(){
        System.out.println("zuuuzuuu...");
    }
    public void callFriend(){
        System.out.println("calling Mukhul...");
    }

    public static void main(String[] args) {
        CellPhone_8b realme5=new CellPhone_8b();
        realme5.ringing();
        realme5.vibrating();
        realme5.callFriend();
    }
}
