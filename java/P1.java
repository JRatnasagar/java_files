public class P1 {

	public static void main(String[] args) {
		int num=65724;
		int rev=0;
		while(num!=0) {
			int res=num%10;
			rev=rev*10+res;
			num/=10;
		}
		for(int i=1;i<=rev;i++) {
			if(rev%2==1) {
				System.out.println(rev);
			}
	}

	}}
