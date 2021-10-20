class Sisters{
 int num;
 String name;
 Sisters(int relationship,byte no){
System.out.println(relationship);
 System.out.println(no);
 }
  Sisters(int num,String name)
 {
	 this.num=num;
	 this.name=name;
	 System.out.println(num);
	 System.out.println(name);
 }
 public static void main(String[] args){
    Sisters sisters=new Sisters(10,"4");
	        sisters=new Sisters(7,"bhoomika");
} 
}