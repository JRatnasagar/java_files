package day1;

//scenario:10
public class PalindromeOrnot {

	public static void main(String[] args) {
		String s="MAM";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
			
		}
		if(s.equals(s1)) 
			System.out.println("The given string is palendrome ");
		
		else  
			System.out.println("The given string is  not a palendrome ");
		
	}

}
