import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int x;
		System.out.println("Digite um valor inteiro por favor");
		x = sc.nextInt();
		for(int i=0; i<=x; i++) {
			if(i%2 != 0) {
			 System.out.println(+i);
			}
		}
	    //Não esquecer caso a condição for falsa o loop do For sai,então para comparar igual,correto e usar
		// "<=". Porque se usar == ele vai enteder que  a condiçaõ e falsa,então ira sair do loop
		sc.close();


	}

}
