import java.util.Scanner;

public class Auction {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int x,multiplicacao;
	    System.out.println("Digite um valor inteiro para calcular fatorial");
	    x = sc.nextInt();
	    multiplicacao = 1;
	    for(int count=x;count >=  1;count--) {
	       multiplicacao = multiplicacao * (count);
//para realizar esse exercicio e necessário sempre a variavel "multiplicacao" armazernar um valor,
//maneira simples de realizar é pegar a variavel que deseja o resultado e multiplicar pela variavel
//que deseja manipular.	       
	          }  	 
	    System.out.println(+multiplicacao);
	    sc.close(); 		
	}

}
