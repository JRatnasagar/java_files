class  CountOf3
{
	public static void main(String[] args){
		int m=1,n=30;
		int count = 0;
        for (int i = m; i <= n; i++) {
            int num = i;
            while (num != 0) {
                if (num % 10 == 3) {
                    count++;
                }
                num /= 10;
            }
        }

        System.out.println("The number of 3's between " + m + " and " + n + " is: " + count);

	}
}
