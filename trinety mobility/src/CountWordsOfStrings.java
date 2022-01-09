
public class CountWordsOfStrings {

	public static void main(String[] args) {
	String str="bbb nnn mmm bbbb jjjjhh jjjj";
	int count=1;
	for(int i=0;i<str.length()-1;i++) {
	if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			count++;
	}
	System.out.println("the number of word is"+count);
	}
}