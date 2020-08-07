import java.util.Scanner;
public class Uri1164 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int contMet, sunSet=0;
		
		int causoTest = src.nextInt();
		
		for (int cont=1; cont<=causoTest; cont++) {
			int number = src.nextInt();	
			if (number == 3+2+1) {
				System.out.println(number + " eh perfeito");
			} else if (number == 14+7+4+2+1) {
				System.out.println(number + " eh perfeito");
			} else if (number == 496) {
				System.out.println(number + " eh perfeito");
			} else if (number == 8128) {
				System.out.println(number + " eh perfeito");
			} else if (number == 33550336) {
				System.out.println(number + " eh perfeito");
			}  else {
				System.out.println(number + " nao eh perfeito");
			}
			/*int numbMet = number / 2;
			for (contMet = 1; contMet<=numbMet; numbMet--) {				
				if (number % contMet == 1) {
					//System.out.println(numbMet);
					//sunSet = numbMet++;
					sunSet+= numbMet;
				}
			}
			
		if (sunSet == number) {
			System.out.println(number + " eh perfeito");
			} else {
				System.out.println(number + " nao eh perfeito");
			}*/
		
		}
		
	}

}