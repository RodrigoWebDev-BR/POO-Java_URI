import java.util.Scanner;
public class Uri1142 {

	public static void main(String[] args) {
		int N, Cont, X;
		
		Scanner src = new Scanner(System.in);
		N = src.nextInt();
		for(Cont=1; Cont<=(4*N-1); Cont+=4) {
			for (X = Cont; X <= Cont+2; X++) {
				System.out.printf(X + " ");
			}
			System.out.print("PUM\n");		
		}

	}

}
