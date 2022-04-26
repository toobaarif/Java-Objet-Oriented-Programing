class Person{
 String name;
 String address;


// Constructor 
 Person(String name, String address){
this.name = name;
this.address = address;
}

// Methods
public void setName(String name){
this.name = name;
}
public String getName(){
return name;
}
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return address;
} 
public String toString(){
return "Name: "+getName()+"\nAdress: "+getAddress();
}
}

class Student extends Person {
 String program;
 int year;
 double fee;

Student (String name, String address, String program, int year, double fee){

super(name, address);

this.name = name;
this.address = address;
this.program = program;
this.year = year;
this.fee = fee;
}

public void setProgram(String program){
this.program = program;
}
public String getProgram(){
return program;
}
public void setYear(int year){
this.year= year;
}
public int getYear(){
return year;
}
public void setFee(double fee){
this.fee = fee;
}
public double getFee(){
return fee;
}
public String toString(){
return "Name: "+getName()+"\nAddress: "+getAddress()+"\nProgram: "+getProgram()+"\nYear: "+getYear()+"\nFee: "+getFee();
}
}


class Staff extends Person {
 String school;
 double pay;

 Staff (String name, String address, String school, double pay ){

super(name, address);
this.name = name;
this.address = address;
this.school = school;
this.pay = pay;
}

public void setSchool(String school){
this.school = school;
}
public String getSchool(){
return school;
}

public void setPay(double pay){
this.pay = pay;
}
public double getPay(){
return pay;
}
public String toString(){
return "Name: "+getName()+"\nAddress: "+getAddress()+"\nSchool: "+getSchool()+"\nPay: "+getPay();
}
}


class PersonTest{
public static void main (String args []){

Student p = new Student("Tooba", "lyari", "BSIT", 2021,16000 );
System.out.println("Student class properties which also extends some properties from Person class(parent class)");
System.out.println(p.toString());

Staff s = new Staff("Marwa", "nazimabad", "KMH school", 3500);
System.out.println("Staff class properties which also extends some properties from Person class(parent class)");
System.out.println(s.toString());

}
}

