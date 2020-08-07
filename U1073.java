import java.util.Scanner;
public class U1073 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int number = src.nextInt();
		
		for (int cont=1; cont<=number; cont++) {
			if (cont % 2 == 0) {
				System.out.println(cont +"^2 = " + (cont * cont));
			}
		}

	}

}
