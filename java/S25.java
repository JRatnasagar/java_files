class S25 {
	public static void main(String[] args) {
		int n=7;
		int space=n-1,star=1;
		for(int i=1;i<=n;i++){
			char ch='A';
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++){
				System.out.print(ch);
				if(i>j){
					ch++;
				}
				else{
					ch--;

				}
			}
		System.out.println();
		if(i<  4){
	star+=2;
	space--;
}
else{
	star-=2;
	space++;
}
		}
	}
	}
