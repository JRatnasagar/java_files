class S24 {
	public static void main(String[] args) {
		int n=4;
		int star=7,mid=star/2+1;
		for(int i=0;i<=n;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++){
				int num=1;
				System.out.print(num);
				if(i+j!=0){
					num++;
				}
				else{
					num--;

				}
			}
		System.out.println();
	star-=2;
}
	
	}
	}
