class PerfectnumOrNot {
	public static void main(String[] args) {
		int n=343,temp=n,fact=1,rem;
		for(int i=1;i<=n/2;i++){
			rem=n%10;
			fact=fact*rem;
			n/=10;
		}
		if(fact==temp){
		System.out.println("giiven num is :"+" perfectnum");
	}
	else{
		System.out.println("giiven num is :"+"  not a perfectnum");
	}
}
}
