package day1;

import java.util.Scanner;

//scenario:5
public class ControlflowStatements {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value : ");
	int input =sc.nextInt();
	if(input%2==0)
		System.out.println("The given number is even :"+input);
	else
		System.out.println("The given number is odd :"+input);
	

	}

}
