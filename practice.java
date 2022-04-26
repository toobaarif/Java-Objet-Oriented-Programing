class practice{
public static void main(String args[]){
java.util.Scanner sc= new java.util.Scanner(System.in);

/*
//1: implicit casting
short a= 250;
int b=a;
System.out.println("value of b: "+b);

//2   
short c= 20;
byte d=(byte)c;
System.out.println(d); 
//3
short e=200;
byte f=(byte)e;
System.out.println(f);

//4
short a=256;
byte b= (byte)a;
System.out.println(b);

//5
short a= 260;
byte b=(byte)a;
System.out.println(b);

//    Input from user
System.out.println("Enter your name: ");
String name = sc.nextLine();
System.out.println("Enter your salary: ");
int salary = sc.nextInt();

//  Converting string into other data types
String var = "50";
byte b1= Byte.parseByte(var);
short s1= Short.parseShort(var);
int i1= Integer.parseInt(var);
long l1= Long.parseLong(var);
float f1= Float.parseFloat(var);
double d1= Double.parseDouble(var);

System.out.println("byte: "+b1);
System.out.println("short: "+s1);
System.out.println("int: "+ i1);
System.out.println("long: "+l1);
System.out.println("float: "+f1);
System.out.println("double: "+d1);

//   mark sheet Assignment
System.out.println("Marks of OOPs");
int oop= sc.nextInt();
System.out.println("Marks of discrete: ");
int dis=sc.nextInt();
System.out.println("Marks of DLD: ");
int dld= sc.nextInt();
System.out.println("Marks of communocation skills: ");
int com = sc.nextInt();
System.out.println("Marks of urdu: ");
int urdu= sc.nextInt();
System.out.println("Marks of pak.studies: ");
int pst =sc.nextInt();
float obtained_marks= oop+dis+dld+com+urdu+pst;
System.out.println("Total obtained marks: "+obtained_marks);
float total_marks= 600;
float result= (obtained_marks/total_marks)*100;
System.out.println("Your percentage: "+result);

if(result>=90){
System.out.println("Your grade is: A1");
}
else if(result>=80){
System.out.println("Your grade is: A+");
}
else if(result>=70){
System.out.println("Your grade is: A");
}
else if(result>=60){
System.out.println("Your grade is: B");
}
else if(result>=50){
System.out.println("Your grade is: C");
}
else if(result>=40){
System.out.println("Your grade is: D");
}
else{
System.out.println("You are fail !");
}

//         oprators
// 1 relational
byte a=100;
byte b=50;
System.out.println(a+"<"+b+": "+(a<b));
System.out.println(a+"<="+b+": "+(a<=b)); 
System.out.println(a+">"+b+": "+(a>b));
System.out.println(a+">="+b+": "+(a>=b));
System.out.println(a+"=="+b+": "+(a==b));
System.out.println(a+"!="+b+": "+(a!=b));

// 2 bitwise
int a=150;
int b=200;
boolean c= ((a<=b) & (a>b));
boolean d= ((a<=b) | (a>b));
boolean e=((a<=b) ^ (a>b));
boolean f= (!(a<=b & a>b));
System.out.println("(a<=b) & (a>b): "+c);
System.out.println("(a<=b) |(a<b): "+d);
System.out.println("(a<=b) ^(a>b) :"+e);
System.out.println("!(a<=b) & (a>b): "+f);

//3 short circuit
int a= 1500;
int b=2000;
boolean c= (a<=b) && (a>b);
boolean d= (a<=b) || (a>b);
System.out.println(c);
System.out.println(d);

//examples 1
int num= 1+8;
System.out.println(num);
num=num-1;
System.out.println(num);
num= num*2;
System.out.println(num);
num=num /2;
System.out.println(num);
num=num+8;
//System.out.println(num);
num=num%7;
System.out.println(num);

// equality oprator
int a=1;
int b=2;
System.out.println(a == b);
System.out.println(a != b);
System.out.println(a > b);
System.out.println(a < b);
System.out.println(a >= b);
System.out.println(a <= b);

int a= 1;
int b=2;
System.out.println((a == 1) && (b == 2));
System.out.println((a == 1) || (b == 1));

// ternary oprators
int a = 1;
int b = 2;
String s = a !=1 ? "Greater than one" : "Less than 1";
System.out.println(s);

// precedence and associetivity
int a = 3;
int b = 3;
int c= 3;
int d=3;
int e=3;
//int f = a+b*c-d/e;
//System.out.println(f); 
//float f= a / (b + c) - d % e;
//System.out.println(f);
float f = a / (b * (c + (d -e)));
System.out.println(f);

//  Assignments
System.out.println("Enter num 1");
int num= sc.nextInt();
System.out.println("Enter num 2");
int num2 = sc.nextInt();
int sum= num+num2;
System.out.println(sum);

System.out.println("Enter num of truks: ");
int trucks= sc.nextInt();
int te=3000;
int dp=1000;
int diesel=500;
int tax=100;
int exp= dp+diesel+tax;
int profit = te - exp;
System.out.println("Per truck earning: "+te);
System.out.println("per truck exp: "+exp);
System.out.println("Per truck  profit: "+profit);

System.out.println("Total earning: "+te*trucks);
System.out.println("Total truck exp: "+exp*trucks);
System.out.println("Total profit: "+ profit*trucks);

// ATM
System.out.println("Enter amount");
int amount=sc.nextInt();
System.out.println("No of 5000 in amount: "+amount/5000);
System.out.println("Num of 1000 in amount: "+(amount%5000)/1000);
System.out.println("Num of 500 in amount: "+((amount%5000)%1000)/500);
System.out.println("Num of 100 in amount: "+(((amount%5000)%1000)%500)/100);
System.out.println("Num of 50 in amount: "+((((amount%5000)%1000)%500)%100)/50);
System.out.println("Num of 20 in amount: "+(((((amount%5000)%1000)%500)%100)%50)/20);
System.out.println("Num of 10 in amount: "+((((((amount%5000)%1000)%500)%100)%50)%20)/10);
System.out.println("Num of 5 in amount: "+(((((((amount%5000)%1000)%500)%100)%50)%20)%10)/5);
System.out.println("Num of 2 in amount: "+((((((((amount%5000)%1000)%500)%100)%50)%20)%10)%5)/2);
System.out.println("Num of 1 in amont: "+(((((((((amount%5000)%1000)%500)%100)%50)%20)%10)%5)%2)/1);

// weight converters
System.out.println("Enter vaalue in grams: ");
float gram=sc.nextFloat();

float kg= gram/1000;
System.out.println("Grams convert into kilogram: "+kg);
float pound= gram/454;
System.out.println("grams convert into pound: "+pound);
float miligram= gram*1000;
System.out.println("grams into miligram: "+miligram);
float milili= gram*1000000;
System.out.println("Grams convert into milili: "+milili);

//  lenght 
System.out.println("Enter meter: ");
float met= sc.nextFloat();
float centi= met*100;
System.out.println("meter to centi: "+centi);
float feet = met* 3.281f;
System.out.println("meter into feet: "+feet);
float inch = met * 39.37f ;
System.out.println("meter into inch : "+inch);

//  temprature
System.out.println("Enter temprature in celcius: ");
float cel = sc.nextFloat();
float fer= (cel * 9/5)+32;
System.out.println("cel into fer: "+fer);
float kel= cel + 273.15f;
System.out.println("cel into kel: "+kel);

System.out.println("Enter salary without tax: ");
float salary= sc.nextFloat();
//salary deduction
int medical= 5;
int rent= 5;
int travel= 5;
int tax = medical+ rent + travel;
System.out.println("Total tax: "+tax);
// formula ==> total * (1 - 100 / 15);
float deduction= salary * (1 - 0.15f);
System.out.println("Salary with deduction: "+deduction);

// Assignments
System.out.println("Enter alphabet: ");
char alphabet = sc.nextLine().charAt(0);
switch(alphabet){
case 'a':
System.out.println(alphabet+" is vowel");
break;
case 'e':
System.out.println(alphabet+" is vowel");
break;
case 'i':
System.out.println(alphabet+" is vowel");
break;
case 'o':
System.out.println(alphabet+" is vowel");
break;
case 'u':
System.out.println(alphabet+" is vowel");

default :
System.out.println(alphabet+" is consonant");
}

//  identify even and odd number
System.out.println("Enter number: ");
int num= sc.nextInt();
if (num % 2 == 0){
System.out.println(num+" is even");
}
else if(num % 2 == 1){
System.out.println(num+" is odd");
}
else{
System.out.println("Invalid error! ");
}
*/
//  leap year 
System.out.println("Enter year in number: ");
int year = sc.nextInt();
if (year % 4 == 0){
System.out.println("This is leap year!");
}
else{
System.out.println("This is not leap year!");
}
}
}

