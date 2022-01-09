
public class CountWordAnother {

	public static void main(String[] args) {
		String str="Java Programmer";
		String[] words=str.split(" ");
		int count=1;
		for(int i=0; i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count=count+1;
					words[j]="0";
				}
					
			}
			if(words[i]!="0")
			System.out.println(words[i]+count);
		}
		
	}
	}