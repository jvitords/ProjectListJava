package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import properties.Accounts;

public class Main {

	public static void main(String[] args) {
		
		// criação da lista com as contas e cadastro delas
		ArrayList<Accounts> contas = new ArrayList<Accounts>();
		Scanner digitar = new Scanner(System.in);
		
		System.out.print("Quantas contas deseja registrar? ");
		int numerosDeContasARegistrar = digitar.nextInt();
		
		for (int i = 0; i < numerosDeContasARegistrar; i++) {
			digitar.nextLine();
			System.out.print("\nDigite o nome do titular: ");
			String nomeDoTitular = digitar.nextLine();
			System.out.print("\nDigite o ID da conta: ");
			Integer idDaConta = digitar.nextInt();
			System.out.print("\nDigite o salário do titular: ");
			Double salarioDoTitular = digitar.nextDouble();
	
			Accounts conta = new Accounts(nomeDoTitular, idDaConta, salarioDoTitular);
			contas.add(conta);
			System.out.println("\nConta registrada com sucesso!\n");
		}
	
		// conta escolhida para receber o aumento
		System.out.print("\nDigite o ID da conta que vai receber o aumento: ");
		int idEspecifico = digitar.nextInt();
		
		Accounts contaComIDEspecifico = contas.stream().filter(conta -> conta.getId() == idEspecifico).findFirst().orElse(null);
		
		if (contaComIDEspecifico != null) {
			System.out.print("Digite qual a porcentagem do aumento: ");
			Double porcentagemDeAumento = digitar.nextDouble();
			contaComIDEspecifico.aumentoDeSalario(porcentagemDeAumento);
			
		} else {
			System.out.println("Conta não existe.");
		}
		
		// mostrar contas com suas informações
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.toString() + "\n");
		}
		
		digitar.close();
		
		// fim do projeto e pastas jogadas para o github
		
		/*
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Joao"); // Adicionar item na lista
		nomes.add("Guilherme");
		nomes.add("Alex");
		nomes.add("Andre");
		nomes.add(2, "Ana"); // Adicionar um item na posição indicada
		//nomes.remove(3); // remover item na posição indicada
		//nomes.removeIf(palavra -> palavra.toLowerCase().charAt(0) == 'a'); // remove o item caso o primeira letra da lista for "A"
		//nomes.removeIf(nome -> nome == "Alex");  // remove o item que tiver valor igual a "Alex"
		System.out.println("Index do nome na posição: " + nomes.indexOf("Guilherme")); // mostra a posição em que está o nome "Guilherme"
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("===============\n");
		
		List<String> listaComNomesIniciadosComA = nomes.stream().filter(primeiraLetra -> primeiraLetra.toLowerCase().charAt(0) == 'a').collect(Collectors.toList()); // filtrar nomes começados com a letra "A"
		
		
		for (String n : listaComNomesIniciadosComA) {
			System.out.println(n);
		}
		
		System.out.println("Primeiro nome encontrado com a letra 'A': " + listaComNomesIniciadosComA.stream().filter(x -> x.toLowerCase().charAt(0) == 'a').findFirst().orElse(null)); // filtrar nomes começados com a letra "a" e imprime o primeiro nome encontrado, caso não tenho vai retornar null
		*/
	}
	
}
