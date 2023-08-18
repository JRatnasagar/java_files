class Strong 
{
	public static void main(String[] args) 
	{
		int n=145,sum=0,temp=n;
		while(n!=0){
			int r=n%10;
		   int fact=1;
		for(int i=1;i<=r;i++){
			fact=fact*i;
		}
			sum=sum+fact;
			n/=10;
		}
	
		if(sum==temp){
		System.out.println("given number is strong number");
	}
	else{
		System.out.println("given number is not a strong number");
}
	}
}
