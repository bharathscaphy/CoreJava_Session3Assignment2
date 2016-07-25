import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Prime or Not Prime");
		System.out.println("Enter a Number:");
		int num=s.nextInt();
		Prime p=new Prime();
		p.isPrime(num);
		s.close();
	}
}
