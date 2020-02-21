package school;

public class Euclid {
	public static int gcd(int num1, int num2) {
		//int quotient = num1/num2;
		
		if (num2 == 0)
			return num1;
		int remainder = num1%num2;
		return gcd(num2, remainder);		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(5,20));
	}

}
