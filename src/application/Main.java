package application;

import java.util.Scanner;

import entities.ContaBanco;

public class Main {

	public static void main(String[] args) {
		
		ContaBanco conta;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Digite o nome do titular: ");
		String nomeTitular = sc.nextLine();
		
		System.out.println("Deseja fazer um deposito inicial ?(s/n)");
		char resp = sc.next().charAt(0);
		
		if(resp == 's') {
			System.out.println("Digite o valor do deposito inicial:");
			
			double saldo = sc.nextDouble();
			
			 conta = new ContaBanco(numeroConta,nomeTitular,saldo);				
		}else {
			
		 conta =  new ContaBanco(numeroConta,nomeTitular);
		
		}
		System.out.println(conta.toString());
		
		System.out.println("Digite o valor do deposito:");
		conta.deposito(sc.nextDouble());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Digite o valor do saque:");
		conta.saque(sc.nextDouble());
		System.out.println("Saldo: " + conta.getSaldo());
		
		sc.close();
	}

}
