package day1;

//scenario: 3
public class Datatypes_Variables {

	public static void main(String[] args) {
	int a=10;
	char c='A';
	long l=9848286617l;
	float f=87.8765456787f;
	byte b=30;
	short s=3456;
	boolean bool=true;
	boolean bool1=false;
	double d=220.87654;
	String s1="sagar learning java";
	String s2="along with our teammates";
	
	int c1=a+b;
	
	int c2=b-a;
	
	String s3=s1+" "+s2; // when + symbol acts as addition as well as cocatination 
	// you perform addition 2 operands must be values not  a string  this time it acts as a addition
	// when you perform 2 strings this time it acts as a cocatination 
	int c3=a*c;
	
	int c4=b/a; //division always gives quotient
	
	int c5=b%a;  //modulus always gives reminder
	
	
	System.out.println("addition of  a+b is :"+c1);
	System.out.println("subtraction of  a-b is :"+c2);
	System.out.println("concatination of  s1+s2 is :"+s3);
	System.out.println("multiplication of  a*c  is :"+c3);
	System.out.println("division  of  b/a is :"+c4);
	System.out.println("modulus of b%a  is :"+c5);
	 
	
	

	}

}
