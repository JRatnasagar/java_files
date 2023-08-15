class P24
{
	public static void main(String[] args) 
	{
          
		for (int i=1;i<=5;i++){
			char ch='a';
			int n=1;
			for(int j=1;j<=5;j++){
				if(i==3){
					System.out.print("+");
			}
				else if(i%2==1){
					System.out.print(n++ );
			}
			else{
				System.out.print(ch++);
			}
			}
		System.out.println();
	
	}
}
}
