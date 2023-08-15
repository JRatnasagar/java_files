class SummationOfNumber {
	public static void main(String[] args) {
		 int n=77788,sum=0;
		 while(n!=0){
			 int r=n%10;
			 sum=sum+r;
			 n/=10;
		 }
		System.out.println(sum);
		
	}
	
}
