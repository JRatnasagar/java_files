class R3 {
	public static void main(String[] args) {
		int m=4,n=1;
		print(m,n);
	}
	public static void print(int m,int n){
		if(m>=1){
			System.out.println(m);
		print(--m,n);
		}
		else if(n<=3){
			System.out.println(n);
			print(m,++n);
		}
}
}

