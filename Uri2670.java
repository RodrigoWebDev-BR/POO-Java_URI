import java.util.Scanner;
public class Uri2670 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int a, b, c;
		a = src.nextInt();
		b = src.nextInt();
		c = src.nextInt();
		
		if((2*b+4*c)<(2*a+2*c) && (2*b+4*c)<(4*a+2*b)){
			System.out.println ((2*b)+(4*c));

		}
		  else if ((2*a+2*c)<(4*a+2*b) && (2*a+2*c)<(4*c+2*b)){
		            System.out.println ((2*a)+(2*c));

		   }
		       else if((2*b+4*a)<(2*a+2*c) && (2*b+4*a)<(4*c+2*b)){
		        	System.out.println ((4*a)+(2*b));

		        }
		            else {
		            	System.out.println ((2*a)+(2*c));

		            }

		
		/*if ((a * 2 + b * 2) < (a * 2 + c * 2)) {
				System.out.println (a * 2 + c * 2);
		} 
			else if ((a * 2 + b * 4) < (a * 2 + c * 2)) {		
				System.out.println (a * 2 + c * 2);
		} 
			else if ((a * 2 + b * 2) < (a * 2 + c * 2)) {
				System.out.println (a * 2 + c * 2);
		}
			
			else if ((a * 4 + b * 2) < (a * 2 + c * 2)) {
				System.out.println (a * 2 + c * 2);
				
		} else if ((b * 2 + c * 2) < (a * 2 + c * 2)) {
				System.out.println (a * 2 + c * 2);
				
		} else if ((b * 2 + c * 4) < (a * 2 + c * 2)) {
				System.out.println (a * 2 + c * 2);
		
		} else if ((b * 4 + c * 2) < (a * 2 + c * 2)) {
				System.out.println (a * 2 + c * 2);
				
		} else {
				System.out.println(a * 2 + c * 2);
				
		}*/
			
	}
}

/*
*/