class GrinderRunner{
 public static void main(String[] args){
       Grinder grinder=new Grinder(3,"sony");
    System.out.println(grinder.company);
    System.out.println(grinder.capacity);
         Motor motor=grinder.motor;
      System.out.println(motor.model);
      System.out.println(motor.rpm);
}
}
