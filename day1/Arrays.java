package day1;

//scenario: 9
public class Arrays {
	public static void main(String[] args) {
		
	
	int a[]= {10,3,5,90,50,100};
	int max =a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max)
			max=a[i];
	}
	System.out.println("The maximum element is :"+max);
	System.out.println();
	
	
	int a1[]= {10,0,5,90,50};
	int min =a1[0];
	for(int i=0;i<a1.length;i++) {
		if(a1[i]<min)
			min=a1[i];
	}
	System.out.println("The minimum element is :"+min);
	}
	
	
}
