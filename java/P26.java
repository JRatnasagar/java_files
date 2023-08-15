class P26
{
	public static void main(String[] args) 
	{
          char ch='a';
			int n=1;
		for (int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System .out.print(n);
					n+=3;
				}
				else{
System.out.print(ch);
ch+=3;
				}
			}
		System.out.println();
	
	}
		}
}
