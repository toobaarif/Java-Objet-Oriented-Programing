class CallByValue1(){

class Test{
public void method(int i, int j){
     i*=2;
     j*=2;
}
}
public ststic void main(String args){
Test obj = new Test();

int a = 15;
int b=20;
System.out.println("a and b before call: "+a +" "+b);

obj.method(a,b);
System.out.println("a and b before call: "+a +" "+b);
}
}