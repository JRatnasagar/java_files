package day1;

import java.util.Scanner;

//scenario:6
public class MenuDriven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item name : ");
		String s=sc.next();
		String s1=s.toLowerCase();
		switch(s1) {
		case "poori" :{
			System.out.println("Today tiffin is poori");
			break;
		}case "idli" :{
			System.out.println("Today tiffin is idli");
			break;
		}case "chapathi" :{
			System.out.println("Today tiffin is chapathi");
			break;
		}case "dose" :{
			System.out.println("Today tiffin is dose");
			break;
		}case "lemonrice" :{
			System.out.println("Today tiffin is lemonrice");
			break;
		}case "upma" :{
			System.out.println("Today tiffin is upma");
			break;
		}case "bonda" :{
			System.out.println("Today tiffin is bonda");
			break;
		}
		default:{
			System.out.println("none of the above ");
		}
		}

	}

}
