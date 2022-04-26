class CallByValue1{

public void method(int i, int j){
     i*=2;
     j*=2;
}

public static void main(String args[]){
CallByValue1 obj = new CallByValue1();

int a = 15;
int b=20;
System.out.println("a and b before call: "+a +" "+b);

obj.method(a,b);
System.out.println("a and b before call: "+a +" "+b);
}
}