class Micro2{
String city,road;
Micro2(int id,String name){
System.out.println(id);
System.out.println(name);
}
Micro2(String city,String road)
{
this.city=city;
this.road=road;
System.out.println(city);
System.out.println(road);

}
public static void main (String[]args){
Micro2 micro=new Micro2(2,"bhoomika");
        micro=new Micro2("banglore","Btm");
}
}


