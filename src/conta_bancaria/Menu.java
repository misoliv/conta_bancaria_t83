package conta_bancaria;

import java.util.Scanner;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		// Instanciar Objetos da Classe Conta
        Conta c1 = new Conta(1, 123, 1, "Cintia Dourado", 500000.00f);
                
        Conta c2 = new Conta(2, 456, 2, "Renata Melo", 600000.00f);
        
        c1.setSaldo(500000.00f);
        c2.setSaldo(600000.00f);
        
        c1.visualizar();
        System.out.println(c1.sacar(1000));
        System.out.println("O saldo da conta é: " + c1.getSaldo());
        
        c1.depositar(1500);
        System.out.println("O saldo da conta é: " + c1.getSaldo());
        
        
        c2.visualizar();
        System.out.println(c2.sacar(1000000));
        System.out.println("O saldo da conta é: " + c2.getSaldo());
               
        c2.depositar(5000);
        System.out.println("O saldo da conta é: " + c2.getSaldo());
        
        
        // Instanciar Objetos da Classe Conta Corrente
        
        ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Thuany Silva", 10000000.00f, 100000.00f);
        
        cc1.visualizar();
        
        //Sacar da Conta Corrente
        
        System.out.println(cc1.sacar(20000000.00f));
        cc1.visualizar();
        
        System.out.println(cc1.sacar(2000.00f));
        cc1.visualizar();        
        
        //Depositar 
        cc1.depositar(20000000.00f);
        cc1.visualizar(); 
        
          
        //Classe Conta Poupança
        
        ContaPoupanca cp1 = new ContaPoupanca(4, 456, 2, "Maria da Silva", 10000000.00f, 15);
        
        cp1.visualizar();
        
        // Sacar da Conta Poupança
        System.out.println(cp1.sacar(50000.00f));
        cp1.visualizar();
        
        //Depositar na Conta Poupança
        cp1.depositar(70000.00f);
        cp1.visualizar();    
        

		
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
			
			opcao = leia.nextInt();
		
		if (opcao == 0) {
			System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco da Mila - O seu Futuro começa aqui!");
			sobre();
			leia.close();
			System.exit(0);
		}
		
		switch (opcao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta \n\n");
			
			break;
		case 2:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas \n\n");
			
			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
			
			break;	
		case 4:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta \n\n");
			
			break;
		case 5:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
			
			break;
		case 6:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
			
			break;	
		case 7:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
			
			break;
		case 8:
			System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
			
			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
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

}
