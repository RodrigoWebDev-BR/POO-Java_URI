
import java.util.Scanner;

public class Uri1180 {

	public static void main(String[] args) {
		 int limite = 100, number, max = 0, pos = 0, Cont;
	        Scanner src =new Scanner(System.in);
	        for (Cont = 1; Cont <= limite; Cont++)
	        {
	            number =src.nextInt();

	            if (max > number) {
	                max = max;
	                pos = pos;
	            } else  {
	                max = number;
	                pos = Cont;
	            }

	        }
	        System.out.println(max);
	        System.out.println(pos);
	    }
	}