class Except7 {
	public static void main(String[] args) {
int m=1,n=77;
		for(int i=m;i<=n;i++){
	int temp=i;
	int count=0;
	while(temp!=0){
		int rem=temp%10;
	if(rem==7){
		count++;
		break;
	}
	temp/=10;
	}
	if(count==0){
	System.out.println(i);
	}
	}
	}
}

