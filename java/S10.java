class S10 {
	public static void main(String[] args) {
		int space=0;
		for (int i=1;i<=5;i++){
			char ch='e';
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--){
				System.out.print(ch--);
			}
		
		System.out.println();
		space++;
	}
			}
}
