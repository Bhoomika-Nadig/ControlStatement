class Type{
	public static void main(String args[]){
		int a = 40;
		int b = 300; 
		double c = 10.34;
		double d = 45.33;
		
		c = a; //Impliciting: which assigns lower datatype to higher datatype.
		System.out.println(c);
		
		b = (int)d; //Expliciting: Which assigns higher datatype to lower datatype.
		System.out.println(b);
		
	}
}