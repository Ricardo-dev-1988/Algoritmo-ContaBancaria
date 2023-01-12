package application;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

import entities.ContaBancaria;


public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);			
		
		ContaBancaria conta;
		
		String numeroConta = JOptionPane.showInputDialog("Digite o número da conta:");
		int iNumeroConta = Integer.parseInt(numeroConta);
		
		while(iNumeroConta <= 999 || iNumeroConta >= 10000) {
			JOptionPane.showMessageDialog(null, "É NECESSÁRIO UM NÚMERO DE QUATRO DÍGITOS! ");
			numeroConta = JOptionPane.showInputDialog("Digite o número da conta:");
			iNumeroConta = Integer.parseInt(numeroConta);
		}
		
		String titular = JOptionPane.showInputDialog("Digite o nome do titular:");
		
		while(titular.length() == 1 || titular.length() == 0) {
			JOptionPane.showMessageDialog(null, "QUANTIDADE DE CARACTERES INVÁLIDO! ");
			titular = JOptionPane.showInputDialog("Digite o nome do titular:");
		}
		
		
		int resp = JOptionPane.showConfirmDialog(null, "Deseja enserir um deposito inicial (yes/no)?");
		if(resp == 0) {
			 String depositoInicial = JOptionPane.showInputDialog("Digite o valor do deposito inicial");
			 double iDepositoInicial = Double.parseDouble(depositoInicial);
			 conta = new ContaBancaria(iNumeroConta, titular, iDepositoInicial);
		}    
		else {
			conta = new ContaBancaria(iNumeroConta, titular);
		}
		
		JOptionPane.showMessageDialog(null, "Dados da conta:" 
											+ "\nConta: "
											+ conta);
		
		String valorDeposito = JOptionPane.showInputDialog("Digite um valor para deposito:");
		double iValorDeposito = Double.parseDouble(valorDeposito);
		conta.depositar(iValorDeposito);
		
		JOptionPane.showMessageDialog(null, "Dados atualizado:" 
											+ "\nConta: "
											+ conta);
		
		String valorSaque = JOptionPane.showInputDialog("Digite um valor para saque:");
		double iValorSaque = Double.parseDouble(valorSaque);
		conta.saque(iValorSaque);
		
		JOptionPane.showMessageDialog(null, "Dados atualizado:" 
											+ "\nConta: "
											+ conta);
		sc.close();
	}
}
 