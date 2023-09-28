package Week3HomeAssignments;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Madam";
		int leng = name.length();
		String rev ="";
		for(int i=leng-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println(" Not a Palindrome Number");
		}

	}



}
