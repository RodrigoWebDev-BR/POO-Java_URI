import java.util.Scanner;

public class UriMultiplos {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner src = new Scanner (System.in);
		
		n1 = src.nextInt();
		
		n2 = src.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println ("Sao Multiplos");
		}
			else {
				System.out.println ("Nao sao Multiplos");
			}

	}

}
