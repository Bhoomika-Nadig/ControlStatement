
public class Factorial {

public static void main(String[] args) {
	int i=1,fact=1,num=4;
	System.out.println("Enter the Factorial::");
	for(int j=1;j<=num;j++) {
		fact=fact*i;
		i++;
		}

System.out.println("the factorial is"+num+fact);
}
}