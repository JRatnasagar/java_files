class CountOfDigits 
{
	public static void main(String[] args) {
		int n=837483,count=0;
		while(n!=0){
			n=n/10;
			count++;
	}
	System.out.print(count);
}
}
