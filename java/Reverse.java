class Reverse
{
	public static void main(String[] args){
		int n=2621,rev=0,rem;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
	}
	
	System.out.print(rev);
	}
}
