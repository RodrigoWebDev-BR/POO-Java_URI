import java.util.Scanner;

public class U1467 {

	private static final Scanner out = null;
	private static final boolean EOF = false;

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int a = src.nextInt();
		int b = src.nextInt();
		int c = src.nextInt();
		
		while (src.hasNext() != EOF) {
		
			if ((a != b) && (a != c)) {
				System.out.println ("A");
			} else if ((b != c) && (b != a)) {
				System.out.println ("B");
			} else if ((c != a) && (c != b)) {
				System.out.println ("C");
			} else {
				System.out.println("*");
			}
		
	out.close();
	}
	}
}
