class parents{
int age;
String name;
parents(int num,String address)
{
System.out.println(num);
System.out.println(address);
}
parents(int age,String name)
{
this.age=age;
this.name=name;
System.out.println(age);
System.out.println(name);
}
public static void main(String[] args)
{
parents parents=new parents(8,"banglore");
        parents=new parents(23,"bhoomika");
}
}