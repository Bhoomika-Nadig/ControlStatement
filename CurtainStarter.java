class CurtainStarter
{
public static void main(String[] args)
{

Curtain curtain=new Curtain();

String name=curtain.getName();
System.out.println("CURTAIN NAME"+name);

float price=curtain.getPrice();
System.out.println("CURTAIN PRICE"+price);

String brand=curtain.getBrand();
System.out.println("CURTAIN BRAND"+brand);


int noOfCurtains=curtain.getNoOfCurtains();
System.out.println("NO OF CURTAIN"+noOfCurtains);

String color=curtain.getColor();
System.out.println("CURTAIN COLOR"+color);

curtain.setName("panel pair");
String name1=curtain.getName();
System.out.println("NEW DESIGN"+name1);

curtain.setPrice(150);
float price1=curtain.getPrice();
System.out.println("NEW DESIGN PRICE"+price1);

curtain.setBrand(brand);
String brand1=curtain.getBrand();
System.out.println("BRAND IS"+brand1);

curtain.setNoOfCurtains(10);
int noOfCurtains1=curtain.getNoOfCurtains();
System.out.println("NoOfCurtains"+noOfCurtains1);

curtain.setColor("brown");
String color1=curtain.getColor();
System.out.println("COLOR IS"+color1);
}
}
