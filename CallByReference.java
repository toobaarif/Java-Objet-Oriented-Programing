class CallByReference{
int i;
int j;

CallByReference(int i, int j){
  a=i;
  b=j;
}
pubic void meth(CallbyReference o){
  o.a*=2;
  o.b/=2;
}

public static void main(String args []){
CallByReference obj = new CallByReference(15, 20);
System.out.println("ob.a and obj.b before call: "+ob,a +" "+obj.b);

obj.meth(ob);
System.out.println("ob.a and obj.b after call: "+ob,a +" "+obj.b);

}
}