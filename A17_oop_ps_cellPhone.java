package com.company;

public class A17_oop_ps_cellPhone {
      public void ring(){
          System.out.println("Ringing...");
      }
      public void vibrate(){
          System.out.println("Vibrating...");
      }
      public void callFriend(){
          System.out.println("Calling friend...");
      }
    public static void main(String[] args) {
        A17_oop_ps_cellPhone realme = new A17_oop_ps_cellPhone();
        realme.ring();
        realme.vibrate();
        realme.callFriend();
    }
}
