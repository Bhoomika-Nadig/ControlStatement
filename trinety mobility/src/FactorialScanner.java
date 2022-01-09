import java.util.*;
public class FactorialScanner {

	public static void main(String[] args) {
		int num;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number::");
		num=Sc.nextInt();
		int i=1,fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
	
}
