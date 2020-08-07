import java.util.Scanner;
import java.io.IOException;
 

public class Uri2060 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner src = new Scanner(System.in);
       int c2=0, c3=0, c4=0, c5=0;
       int number = src.nextInt();	
				
		for (int cont=0; cont<number; cont++) {
			int x = src.nextInt();
			
				if (x % 2 == 0) {
					c2++;	
				} if (x % 3 == 0) {					
					c3++;
				} if (x % 4 == 0) {
					c4++; 
				} if (x % 5 == 0) {
					c5++;
				}
			
			}
		System.out.print(c2 + " Multiplo(s) de 2\n");
		System.out.print(c3 + " Multiplo(s) de 3\n");
		System.out.print(c4 + " Multiplo(s) de 4\n");
		System.out.print(c5 + " Multiplo(s) de 5\n");
		}
    
	}
