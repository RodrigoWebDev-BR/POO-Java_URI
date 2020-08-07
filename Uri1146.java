import java.util.Scanner;

public class Uri1146 {

	public static void main(String[] args) {
		
		int number, cont;
				
		Scanner src = new Scanner (System.in);
		while((number = src.nextInt()) != 0) {
			
				for(cont=1; cont<=number; cont++){
					if(cont == number) {
					System.out.print(cont + "\n");
				}else {
					System.out.print(cont + " ");			
				}	
			}		
		}
	}
}
