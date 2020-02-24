package school;
import java.util.*;
public class Euclid {
	public static int gcd(int num1, int num2) {
		
		if (num2 == 0)
			return num1;
		int remainder = num1%num2;
		return gcd(num2, remainder);		
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Enter your second number");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.println("The GCD is " + gcd(x,y));
	}

}
