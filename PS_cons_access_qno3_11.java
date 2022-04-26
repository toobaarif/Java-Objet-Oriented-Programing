package com.company;

public class PS_cons_access_qno3_11 {
    private int length;
    private int breath;

    public PS_cons_access_qno3_11(){
       length=5;
       breath=4;
    }
    //Constructor Overloading
    public PS_cons_access_qno3_11(int length, int breath){
       this.length =length;
       this.breath=breath;
    }

    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
    }
    public static void main(String[] args) {
        PS_cons_access_qno3_11 obj= new PS_cons_access_qno3_11(6,9);
        System.out.println("Length: "+obj.getLength());
        System.out.println("Breath: "+obj.getBreath());
    }
}
