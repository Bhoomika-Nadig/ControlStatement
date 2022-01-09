
public class ReplaceCharater {

	public static void main(String[] args) {
	String str="Bhoomika Nadig";
	
		int index=2;
		char ch='b';
		System.out.println("the original string is"+str);
		str=str.substring(0,index)+ch+ str.substring(index+1);
		System.out.println("the Modified string is"+str);
}

}
