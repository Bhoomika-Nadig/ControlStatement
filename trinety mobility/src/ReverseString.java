
public class ReverseString {

	public static void main(String[] args) {
		String str="Bhoomika Nadig";
		String reversedstr=" ";
		for(int i=str.length()-1;i>=0;i--) {
			reversedstr=reversedstr+str.charAt(i);
		}
		System.out.println("the orginal string is"+str);
		System.out.println("the orginal string is"+reversedstr);
		
	}
}