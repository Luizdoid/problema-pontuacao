import java.util.Locale;
import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int quantidadedecompras,quantidadedeatrasos;
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
		
		sc.close();
	}

}