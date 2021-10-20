class Operators{
public static void main(String args[]){
System.out.print("Operators are:\n 1.Arithmetic Operators\n 2.Assignment Operators\n 3.Comparsion Operators\n 4.Logical Operators");

System.out.println();
System.out.println();

System.out.println("Arithmetic Operators");
int a= 40, b=20 , add,sub,multiplication,division,modulus;
System.out.println("a value is "+a);
System.out.println("b value is "+b);

add = a+b;
sub = a-b;
multiplication= a*b;
division=a/b;
modulus= a%b;

System.out.println(" Results of Addition  (a+b) is : " + add );
System.out.println(" Results of Subtractions(a-b) is : " + sub);
System.out.println(" Results of multiplication (a*b) is : " + multiplication );
System.out.println(" Results of division (a/b) is  : " + division );
System.out.println(" Results of modulus(a%b) is : " + modulus );
System.out.println();
System.out.println();


System.out.println("Assignment Operators");
int c = 5;
int d =4, greater, less;
System.out.println("value of c is (c=5) is : "+ c);
System.out.println();
System.out.println();


int e =7;
System.out.println("comparison operators");
System.out.println("Value of e is : "+e);
System.out.println("Value of d is : "+d);
System.out.println(" if e > d ????");
System.out.println(e > d);

System.out.println();
System.out.println();

System.out.println(" Logical operators");
int log1=10,log2=20 ;
System.out.println("Value of log1 is : "+log1);
System.out.println("Value of log2 is : "+log2);
System.out.println( "AND  logical operators");
System.out.println( "log1 > 5 && log2 < 30");
System.out.println( log1 > 5 && log2 < 30);
System.out.println();
System.out.println();
System.out.println( "OR logical operators");
System.out.println( "log1 > 15 || log2 < 25");
System.out.println( log1 > 15 || log2 < 25);
}
}
