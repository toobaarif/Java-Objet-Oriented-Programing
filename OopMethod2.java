class OopMethod2{
double width;
double height;
double depth;

//public double volume(){       // returning method
//return width* height * depth;
//}

// 2: parametrized method with square
public int square(int i){
 return i * i;
}

public void add(int a , int b){
System.out.println("sum is: "+  a*b);
}


public static void main (String args[]){
OopMethod2 obj = new OopMethod2();
//obj.width = 1;
//obj.height = 2;
//obj.depth = 3;
//System.out.println("Volume is: "+ obj.volume());

//  with new obj2:   second reuse with same class attributes and method behavior
//OopMethod2 obj2 = new OopMethod2();
//obj2.width = 1;
//obj2.height = 4;
//obj2.depth = 6;
//System.out.println("Volume is: "+ obj2.volume());


// 2: parametrized method
System.out.println("Square: "+obj.square(10));
obj.add(1,2);

}
}