class DigitsInVertically 
{
	public static void main(String[] args) 
	{
		int n=6789;
		while(n!=0){
	        int res=n%10;
			n=n/10;
		
		System.out.println(res);
		}
		
}
	
}