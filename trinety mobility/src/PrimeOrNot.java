import java.util.*;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("The Number is");
		int num=Sc.nextInt();
		boolean isprime = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				isprime = true;
				break;
			}
		}
		if (!isprime) {
			System.out.println(num+"is number is prime");
		} else {
			System.out.println(num+"is number is  not prime");
		}
	}
}
