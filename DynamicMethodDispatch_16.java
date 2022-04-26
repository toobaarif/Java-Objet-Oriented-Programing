package com.company;

// second class ka srf override wala run hoga first class k sary run hongy srf override wala ani
class phone{
    public void ShowTime(){
        System.out.println("Time is 8 am");
    }
    public void On(){
        System.out.println("Turning on the phone...");
    }
    public void Ring(){
        System.out.println("phone is ringing..");
    }
}

class SmartPhone extends phone{
    public void PlayingMusic(){
        System.out.println("playing music...");
    }
    @Override
    public void On(){
        System.out.println("Turning on the smart phone..");
    }
}

public class DynamicMethodDispatch_16 {
    public static void main(String[] args) {
        //We know that these objects sre Allowed to excess
       /* phone obj=new phone();
        obj.On();
        obj.ShowTime();
        obj.Ring();
        //Its object of Smart phone Allowed
        SmartPhone sobj = new SmartPhone();
        sobj.PlayingMusic();
        sobj.ShowTime();
        sobj.On();
*/
        //Method decide on runtime obj bcz make on runtime
        phone object =new SmartPhone();
        object.ShowTime();
        object.On();
        object.Ring();
      //  object.PlayingMusic(); not Allowed throws an error


    }
}
