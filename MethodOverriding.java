class Parent1{
int a;
public void meth1(){
System.out.println("I am meth1 of class parent");
}
public void meth2(){
System.out.println("I am meth2 of class parent");
}
}

class Child1 extends Parent1 {
public void meth2(){
System.out.println("I am meth2 of class child which is override from parent class meth2");
}
}



class MethodOverriding{
public static void main(String args []){
Child1 obj = new Child1();
// We know that we can create child class object and run also run the parent class methods or its on method
//obj.meth1();
//obj.meth2();
//obj.hey();

// in this math2 of child class excuted which is override
obj.meth2();


}
}