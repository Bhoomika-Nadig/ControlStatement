class IceCremStarter{

public static void main(String[] args)
{
IceCream cream;
cream=new IceCream(-20,"Tender",Color.YELLOW);
System.out.println(cream.temp);
System.out.println(cream.flavour);
System.out.println(cream.color);
System.out.println(cream.brand);
System.out.println(cream.type);
cream.type="Cone";
cream.brand=new Brand();
System.out.println(cream.brand);
System.out.println(cream);
String fla=cream.flavour;
System.out.println(fla);
float temp=cream.temp;
Brand brand=cream.brand;
String name=brand.name;
String location=brand.location;
String oname=brand.ownerName;
int since=brand.since;
System.out.println(name);
System.out.println(location);
System.out.println(oname);
System.out.println(since);
brand.name="Naturals";
brand.since=1947;
System.out.println(name);
System.out.println(location);
System.out.println(oname);
System.out.println(since);
cream.brand=null;
System.out.println(brand.location);
}
}