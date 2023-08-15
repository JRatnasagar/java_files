class S22 {
	public static void main(String[] args) {
		int n=7;

		int space=n/2,star=1, num=1;
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++){
				System.out.print(num);
			}
		System.out.println();
if(i<=n/2){
	star+=2;
	space--;
	num++;
}
else{
star-=2;
	space++;
	num--;
}
	
	}
	}
}
