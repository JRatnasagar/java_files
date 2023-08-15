class Except6 {
	public static void main(String[] args) {
int m=50,n=70;
int count=0,count1=0;
		for(int i=m;i<=n;i++){
	int temp=i;
	
	while(temp!=0){
		int rem=temp%10;
	if(rem==6){
		count++;
		break;
	}
	
	temp/=10;
	}
	temp=i;
	while(temp!=0){
		int rem=temp%10;
	if(rem==6){
		count1++;
		
	}
	
	temp/=10;
	}
	}
	System.out.println(count);
	
	System.out.println("total no of sixes are  "+count1);
	}
}

