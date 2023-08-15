class S17
{
	public static void main(String[] args) 
	{
		int n=8,space=n-1;
for(int i=1;i<=n;i++){
	for(int j=1; j<=i;j++){
		System.out.print("*");
	}
	for(int j=1;j<=space;j++){
		System.out.print(" ");
	}
	for(int j=n;j>=i;j--){
		System.out.print("*");
}
System.out.println();
space--;


}
	}
}
