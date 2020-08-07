import java.util.Scanner;
import java.lang.*;
public class U1145 {

	public static void main(String[] args) {
		int x, y, cont;
		Scanner src = new Scanner(System.in);
		x = src.nextInt();
		y = src.nextInt();
		
		for (cont=0; cont<=x; cont++) {
			for (cont=1; cont<y; cont++) {
				System.out.printf("%d"+" ", cont);
				if (x==cont) {
					System.out.print("\n");
				}
			}
		}
		//System.out.print("\n");
	}

}
