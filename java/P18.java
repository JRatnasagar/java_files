class P18
{
	public static void main(String[] args) 
	{

		for (int i=1;i<=4;i++){
			char ch='A';
			int n=1;
			for(int j=1;j<=4;j++){
				if(i%2==1){
					System.out.print( ch++ );
			}
			else{
				System.out.print(n++);
			}
			}
		System.out.println();
	
	}
}
}
