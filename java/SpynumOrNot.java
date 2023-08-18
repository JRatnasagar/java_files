class SpynumOrNot {
	public static void main(String[] args) {
		int n=343,sum=0,pro=1,rem;
		while(n!=0){
			rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n/=10;
		}
		if(sum==pro){
		System.out.println("giiven num is :"+" spynum");
	}
	else{
		System.out.println("giiven num is :"+"  not a spynum");
	}
}
}
