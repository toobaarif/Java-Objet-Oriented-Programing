class Parent{
int a;
int b;
public void name(){
      System.out.println("My name is Tooba");
}
}
class Child extends Parent{

}

class Inherit{
public static void main (String args []){
      Parent p= new Parent();
 // p.name();
   
   Child c = new Child();
  //  c.name();
    c.a =1;
    c.b = 2;
     System.out.println(c.a() ); 

}
}