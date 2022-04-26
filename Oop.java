class OopConsObjClass{
double width;
double height;
double depth;

// using constructor
//public OopConsObjClass(){
//System.out.println("no parameterized constructor!");
// width = 10;
// height = 12;
// depth = 2;
//}

//public Oop(double w, double h, double d){  //parameterized constructor(we put //value in object)
//this.width = w;
//this.height = h;
//this.depth = d;
//}


public static void main(String args []){
OopConsObjClass obj = new OopConsObjClass(); // object
// initialize value of class variable here
obj.width = 10;
obj.height =1;
obj.depth = 2;
double vol;
vol = obj.width* obj.height* obj.depth;
System.out.println("Volume: "+ vol);
}
}