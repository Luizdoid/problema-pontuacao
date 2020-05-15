import java.util.Locale;
import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidadedecompras, quantidadedeatrasos,pontosdecompras, scoredeinadimplencia=0, scoredepagamento,pontosqueforamganhados=0;
		double ticketmedio;
		char formadepagamento;

		// CABE�ALHO //

		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println();

		// LEITURA DO VOLUME //

		System.out.printf("Quantas compras o cliente fez no �ltimo ano?");
		quantidadedecompras = sc.nextInt();
		System.out.printf("Qual o ticket m�dio?");
		ticketmedio = sc.nextDouble();

		// LEITURA DOS OUTROS DADOS //

		System.out.println();
		System.out.printf("Quantas vezes o cliente atrasou o pagamento?");
		quantidadedeatrasos = sc.nextInt();
		System.out.printf("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)?");
		formadepagamento = sc.next().charAt(0);

		// SCORE DE VOLUME DE COMPRAS //

		if (quantidadedecompras == 0) {
			pontosdecompras = 0;
			System.out.println();
			System.out.printf("Score de volume de compras = " + pontosdecompras + " pontos");
		}
		else if (ticketmedio <= 3000 && quantidadedecompras <= 2) {
			pontosdecompras = 20;
			System.out.println();
			System.out.printf("Score de volume de compras = " + pontosdecompras + " pontos");
		}
		else if (ticketmedio <= 3000 && quantidadedecompras > 2) {
			pontosdecompras = 40;
			System.out.println();
			System.out.printf("Score de volume de compras = " + pontosdecompras + " pontos");
		}
		else if (ticketmedio > 3000) {
			pontosdecompras = 60;
			System.out.println();
			System.out.printf("Score de volume de compras = " + pontosdecompras + " pontos");
		}
		else {
			pontosdecompras = 0;
		}
			
		System.out.println();
		
		// SCORE DE INADIMPLENCIA E PAGAMENTO //
		
		System.out.println();

		if (quantidadedeatrasos > 1 || quantidadedecompras == 0) {
			scoredeinadimplencia	 = 0;
		}
		else if (quantidadedecompras > 0 && quantidadedeatrasos == 1) {
			scoredeinadimplencia = 15;
		}
		if (quantidadedecompras > 0 && quantidadedeatrasos == 0) {
			scoredeinadimplencia = 30;
		}

		System.out.println("Score de inadimpl�ncia = " + scoredeinadimplencia + " pontos");
			
		if (quantidadedecompras > 0 && formadepagamento == 'd' || formadepagamento == 'D') {
			pontosqueforamganhados = 5;
		}
		if (quantidadedecompras > 0 && formadepagamento == 'c' || formadepagamento == 'C' || formadepagamento == 'b' || formadepagamento == 'B') {
			pontosqueforamganhados  = 10;
		}
		System.out.println("Score de forma de pagamento = " + pontosqueforamganhados  + " pontos");
		
			
			
			
		
		
		
		sc.close();
	}

	}
	

