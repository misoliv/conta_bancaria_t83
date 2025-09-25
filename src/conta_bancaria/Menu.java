package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();
	
	public static void main(String[] args) {

		int opcao;
		
		criarContasTeste();
		
  		while (true) {
			
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("          BANCO DA MILA                              ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("      1 - Criar conta                                ");
			System.out.println("      2 - Listar todas as Contas                     ");
			System.out.println("      3 - Buscar Conta por Numero                    ");
			System.out.println("      4 - Atualizar Dados da Conta                   ");
			System.out.println("      5 - Apagar Conta                               ");
			System.out.println("      6 - Sacar                                      ");
			System.out.println("      7 - Depositar                                  ");
			System.out.println("      8 - Transferir valores entre Contas            ");
			System.out.println("      0 - Sair                                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                 " + Cores.TEXT_RESET);
			
			
		try {
			opcao = leia.nextInt();
			leia.nextLine();
		}catch(InputMismatchException e){
			opcao = -1;
			System.out.println("\nDigite um número inteiro entre 0 e 8");
			leia.nextLine();
		}
		
		if (opcao == 0) {
			System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco da Mila - O seu Futuro começa aqui!");
			sobre();
			leia.close();
			System.exit(0);
		}
		
		switch (opcao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta \n\n");
			
			keyPress();
			break;
		case 2:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas \n\n");
			
			listarContas();
			
			keyPress();
			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
			
			keyPress();
			break;	
		case 4:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta \n\n");
			
			keyPress();
			break;
		case 5:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
			
			keyPress();
			break;
		case 6:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
			
			keyPress();
			break;	
		case 7:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
			
			keyPress();
			break;
		case 8:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
			
			keyPress();
			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
			keyPress();
			break;	
			
		}
		
	}
		
}

	public static void sobre() {
		System.out.println("\n*************************************");
		System.out.println("Projeto desenvolvido por Milena Svitras");
		System.out.println("Milena Svitras - milenasvitras@gmail.com");
		System.out.println("github.com/misoliv");
		System.out.println("***************************************");
	}
	
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.nextLine();
	}

	private static void criarContasTeste() {
		contaController.cadastrar(new ContaCorrente(1, 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(2, 456, 2, "Marcia Condarco", 1000000.00f, 10));
	}
	
	private static void listarContas() {
		contaController.listarTodas();
	}
	
}
