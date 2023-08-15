class P19
{
	public static void main(String[] args) 
	{
          char ch='a';
			int n=1;
		for (int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i%2==1){
					System.out.print( n++ );
			}
			else{
				System.out.print(ch++);
			}
			}
		System.out.println();
	
	}
}
}
