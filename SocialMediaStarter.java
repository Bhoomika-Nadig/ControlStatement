class SocialMediaStarter{
public static void main(String[] args){
SocialMedia media=new SocialMedia();
media.setName("Instagram");
System.out.println(media.name);

media.setSize(5);
System.out.println(media.size);

media.setVersion(3);
System.out.println(media.version);

media.setPlatform("java");
System.out.println(media.platform);
Company comp=new Company();
media.setCompany(comp);
System.out.println(media.company);
comp.setFounder("mark");
System.out.println(comp.founder);
System.out.println(media.company.founder);
comp.setName("facebook");
System.out.println(comp.name);
}
}