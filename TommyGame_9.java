package com.company;

public class TommyGame_9 {
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public  void run(){
        System.out.println("running from the enemy ");
    }
    public void fire(){
        System.out.println("fire on the enemy ");
    }

    public static void main(String[] args) {
    TommyGame_9 player=new TommyGame_9();
    player.hit();
    player.run();
    player.fire();
    }
}
