class Plane{
 static String Src_name="Banglore";
 static String Des_name="Delhi";
 static double Ticket_price=6000;

static void myPlane(){
String name="Indigo";
System.out.println("flight name is "+name);
//System.out.println();
}
static void myclasses(){
String classa="Bussiness Class";
String classb="Economy Class";
System.out.println("flight class name is "+classa);
System.out.println("flight class name is "+classb);
//System.out.println();
}
static void myfood(){
boolean food=true;
System.out.println("flight food  is good or bad"+food);
System.out.println("flight source point is "+Src_name);
}																																																																																																															
public static void main(String args[]){
System.out.println("flight source point is "+Src_name);
System.out.println("flight Destination point is "+Des_name);
System.out.println("flight ticket is "+Ticket_price);
myPlane();
myclasses();
myfood();
}
}












