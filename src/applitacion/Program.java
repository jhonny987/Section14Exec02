package applitacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char tpPessoa = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if (tpPessoa == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				pessoas.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			} else {
				System.out.print("Number of employees: ");
				int numeroFuncionarios = sc.nextInt();
				pessoas.add(new PessoaJuridica(name, rendaAnual, numeroFuncionarios));				
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes = 0.0;
		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getName() + ": $ " + String.format("%.2f", pessoa.imposto()));
			totalTaxes += pessoa.imposto();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		sc.close();
		

	}

}
