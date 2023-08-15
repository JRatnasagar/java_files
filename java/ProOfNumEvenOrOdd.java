class ProOfNumEvenOrOdd{
	public static void main(String[] args) {
		int n=55,pro=1,rem; 
		while(n!=0){
	        rem=n%10;
			 pro=pro*rem;
			 	n/=10;
		}
		if(pro%2==0){
		System.out.print("the given number is even");
		}
		else{
        System.out.print("the given number is odd");
		}
	}
	
}
