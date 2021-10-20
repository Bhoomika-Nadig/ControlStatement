class Example{
int age;
String name;
Example(){
System.out.println("default constructor is invoked");
}
public static void main(String[] args)
{
Example example=new Example();
System.out.println(example.age);
System.out.println(example.name);
}
}
