class Forest{
String name="forest";
String location;
String reserved;
String state;

Forest(String name){
this.name=name;
}
Forest(String name,String location,String state){
this(name);
this.location=location;
this.state=state;
}
}