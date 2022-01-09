import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		int num;
		Scanner Sc=new Scanner(System.in);
		System.out.println("The Harmonic Number is");
		 num=Sc.nextInt();
		double result=0.0;
		System.out.println("The Harmonic Number is");
		for(int i=num;i>0;i--) {
			result=result+(double)1/i;
			System.out.println( result+" ,");
		}
	}

}
 