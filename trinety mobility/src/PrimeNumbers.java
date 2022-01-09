
public class PrimeNumbers {
	public static void main(String[] args) {
		int num=15;
		
			for(int i=2;i<num;i++) {
				while(num%i==0) {
					System.out.println(i+" ");
					num=num%i;
				}
			}
			if(num>2)
				System.out.println(num);
	}
}
