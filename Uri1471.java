import java.util.Scanner;
//import java.util.Arrays;
public abstract class Uri1471 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int volt=0, cont=0, afog=0;		
		int n = src.nextInt();
		int r = src.nextInt();		
		
		for (cont=1; cont<=r; cont++) {
			volt = src.nextInt();
			
		}
		if (n == r) {
			System.out.println("*");
		}else if (cont > volt) {
			afog = cont - volt;
			//int afog = volt!= cont;
			//Arrays.binarySearch(volt!=cont);
			//int afog = cont-vetR[r];
			System.out.println(afog);
		}
		
	}
}
