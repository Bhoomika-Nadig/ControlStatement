import java.util.Scanner;

public class ReplaceCharScanner {

	public static void main(String[] args) {
		String str;
		Scanner Sc=new Scanner(System.in);
		System.out.println("the string is");
	    str=Sc.next();
		int index=2;
		char ch='b';
		System.out.println("the original string is"+str);
		str=str.substring(0,index)+ch+ str.substring(index+1);
		System.out.println("the Modified string is"+str);
}

}
