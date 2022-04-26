class Parents{

Parents (){
System.out.println("I ma a constructor!");  //constructor 
}
Parents (int a){
 this.a =a;
}

}

class Childs extends Parents{
//Childs (){
//super(0);
//System.out.println("I am child class constructor!");
//}

}

class ConstructorInheritance{
public static void main(String args []){

Parents p = new Parents ();


Childs c = new Childs (1);



}
}