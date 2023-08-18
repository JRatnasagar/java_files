class R4 {
	public static void main(String[] args) {
		int m=4,n=1;
		print1(m,n);
	}
	public static void print1(int m,int n){
		if(m>=1){
			System.out.println(m);
		print1(--m,n);
		}
		else if(n<=3){
			System.out.println(n);
			print1(m,++n);
		}
}
}

