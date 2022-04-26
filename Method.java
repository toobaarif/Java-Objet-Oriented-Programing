class Method{
double height;
double width;
double depth;

//public Method (double w, double h, double d){   // parameterizad constructor
//this.height = w;
//this.height = h;
//this.depth =d;
//}

public void volume(){  //  method
System.out.println("Volume is: "+height* width* depth);
}


public static void main(String args[]){
Method obj = new Method(); // obj 1
double vol ;

obj.width = 1;
obj.height= 2;
obj.depth =3;
obj.volume();	

// varible of class and method reuse
Method obj2 = new Method();  //obj2 and reuse class properties
obj2.width = 2;
obj2.height =3;
obj2.depth =4;
obj2.volume();
}
}