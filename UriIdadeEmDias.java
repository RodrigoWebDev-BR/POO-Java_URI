import java.util.Scanner;

public class UriIdadeEmDias {

	public static void main(String[] args) {
		int ano, mes, dia, idade;
		
		Scanner src = new Scanner (System.in); 
		idade = src.nextInt();
		
		ano = idade /365;

	    mes = idade % 365 / 30;

	    dia = idade % 365 % 30;
			
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	}

}
