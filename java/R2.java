class R2 {
	public static void main(String[] args) {
		int n=10;
		fact(n);
	}
	public static void fact(int n){
		if(n>=1){
			System.out.println(n);
			fact(--n);
		}
		}
}

