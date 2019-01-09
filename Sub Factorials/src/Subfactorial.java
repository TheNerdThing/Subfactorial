import java.util.Scanner;
import java.math.*;
/**
 * @author Gregroy Evevsky
 *
 */
public class Subfactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print(" nter the number: ");
			int give = sc.nextInt();
			System.out.println("the sub factiroal is: " + subfactorial(give));
		}while(true);
		
	}

	public static int factorial(int n) {
		int give = 1; 
		for(int i = n; i > 0; i--) {
			give *=i;
		}
		return give;
	}
	
	public static int subfactorial (int n){
		int give; 
		double sumation = 0;
		give = factorial(n);
		for(int i =0; i <= n; i++) {
			sumation += Math.pow(-1, i) / factorial(i);		
		}
		return (int)Math.floor(give * sumation);
	}

		
}
