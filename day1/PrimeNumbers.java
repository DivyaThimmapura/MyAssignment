package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 33;
		boolean flag =false;
		for (int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag= true;
				break;
			}
		}
		if(!flag)
			System.out.println("is a prime number:"+num);
		else
			System.out.println("is not a prime number:"+num);

	}

}
