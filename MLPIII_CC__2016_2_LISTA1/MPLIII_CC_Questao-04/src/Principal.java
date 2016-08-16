
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws Exception {
		Fita fita;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("                     LOCADORA DE FITAS\n" + "                     CADASTRO DE PREÇOS");
		System.out.println("1. Lançamentos\n2. Infantis");
		System.out.println("\nInforme o gênero que deseja cadastrar.");
		int opcao = Integer.parseInt(buffer.readLine());

		// TÍTULO DO FILME(ENTRADA)
		System.out.println("Informe o título do filme:");
		String titulo = buffer.readLine();

		// PREÇO DO FILME(ENTRADA)
		System.out.println("Informe o preço do filme:");
		double preco = Double.parseDouble(buffer.readLine());

		switch (opcao) {
		case 1: {
			fita = new FitaLancamento(titulo, preco);

		// TÍTULO, PREÇO ORIGINAL E PREÇO REAJUSTADO (SAÍDA COM AS IMPRESSÕES)
			System.out.println(
					"\nTítulo do filme.: " + fita.getTitulo() + "\nValor informado.: R$ " + String.format("%.2f", preco)
							+ "\nPreço reajustado: R$ " + String.format("%.2f", fita.getPreco()));
			break;
		}
		case 2: {
			fita = new FitaInfantil(titulo, preco);

		// TÍTULO, PREÇO ORIGINAL E PREÇO DESCONTADO(SAÍDA COM AS IMPRESSÕES)
			System.out.println(
					"\nTítulo do filme.: " + fita.getTitulo() + "\nValor informado.: R$ " + String.format("%.2f", preco)
							+ "\nPreço descontato: R$ " + String.format("%.2f", fita.getPreco()));
			break;
		}
		default:
		}

	}
}
