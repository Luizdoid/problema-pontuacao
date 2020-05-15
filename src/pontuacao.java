import java.util.Locale;
import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int quantidadedecompras;
		double ticketmedio;
		
		
		// CABEÇALHO //
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();	

		// LEITURA DO VOLUME //
		
		System.out.printf("Quantas compras o cliente fez no último ano?");
		quantidadedecompras = sc.nextInt();
		System.out.printf("Qual o ticket médio?");
		ticketmedio = sc.nextDouble();

		
		sc.close();
	}

}