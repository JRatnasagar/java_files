class SumOfNumEvenOrOdd{
	public static void main(String[] args) {
		int n=76997,sum=0,rem; 
		while(n!=0){
	        rem=n%10;
			 sum=sum+rem;
			 	n/=10;
		}
		if(sum%2==0){
		System.out.print("the given number is even");
		}
		else{
        System.out.print("the given number is odd");
		}
	}
	
}
