class P25
{
	public static void main(String[] args) 
	{
          char ch='z';
			int n=1;
		for (int i=1;i<=5;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(n++ );
				
					if(n>9){
						n=1;
			}
				}
			else{
				System.out.print(ch--);
			}
			}
			
		System.out.println();
	
	}
		}
}
