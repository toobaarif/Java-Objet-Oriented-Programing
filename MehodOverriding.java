class parent{
int a;
public void meth1(){
System.out.println("I am meth1 of class parent");
}
public void meth2(){
System.out.println("I am meth2 of class parent");
}
}

class Child extends Parent {
public void hey(){
System.out.println("I am a Child class method");
}
}



class MethodOverriding{
public static void main(String args []){
Child c = new Child();
c.meth2();

}
}