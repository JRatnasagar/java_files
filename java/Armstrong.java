class Armstrong {
	public static void main(String[] args) {
		int num=122,c=0,sum=0;
		while(num!=0){
			c++;
			num/=10;
		}
		int temp=num;
		while(num!=0){
			int r=num%10;
				int p=1;
		for(int i=1;i<=c;i++){
			p=p*r;
		}
		sum=sum+p;
		num/=10;
		}
if (temp==sum){
	System.out.println("given num is:"+" armstrong");
}
	else{
		System.out.println("given num is:"+" not a armstrong");


}
	}
}
