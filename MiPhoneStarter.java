class MiPhoneStarter{
public static void main(String args[]){
MiPhone phonepay=new MiPhone();
 phonepay.setBrand("gionee");
 System.out.println(phonepay.brand);
 
 phonepay.setCost(1000);
 System.out.println(phonepay.cost);
 
 phonepay.setColor("black");
  System.out.println(phonepay.color);
  
  phonepay.setColor("1234567");
  System.out.println(phonepay.imei);
  
  PhonePay phonepay1=new PhonePay();
  phonepay.setPhonepay(phonepay1);
  
  System.out.println(phonepay.phonepay);
  
  
  phonepay1.setName("stara");
  System.out.println(phonepay1.name);
  phonepay1.setVersion(5.0f);
  System.out.println(phonepay1.version);
   phonepay1.setWorking(true);
  System.out.println(phonepay1.working);
   phonepay1.setArchitect("good");
  System.out.println(phonepay1.architect);
}
}
   
