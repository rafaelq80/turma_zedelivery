package rh;

import java.io.IOException;
import java.util.Scanner;

import rh.model.Colaborador;
import rh.model.Gerente;
import rh.model.Vendedor;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nCriar Funcionários\n");
		
		Gerente funcionario1 = new Gerente(0, "Julia Andrews", 
				"julia@email.com.br", 1, 7000.0f, 1000.0f);
		funcionario1.visualizar();
		
		Vendedor funcionario2 = new Vendedor(0, "Maria Flores", 
				"maria@email.com.br", 2, 2000.0f, 5.0f);
		funcionario2.visualizar();
		
		Colaborador funcionario3 = new Colaborador(0, "Paulo Antunes", 
				"paulo@email.com.br", 2, 2000.0f);
		funcionario3.visualizar();
				
		int opcao;
		
		
		while(true) {

				System.out.println("*********************************************************************");
				System.out.println("                                                                     ");
				System.out.println("                      CADASTRO DE COLABORADORES                      ");
				System.out.println("                                                                     ");
				System.out.println("*********************************************************************");
				System.out.println("                                                                     ");
				System.out.println("            1 - Inserir novo Colaborador                             ");
				System.out.println("            2 - Ver os dados de todos os Colaboradores               ");
				System.out.println("            3 - Ver os dados de um Colaborador                       ");
				System.out.println("            4 - Atualizar os dados de um Colaborador                 ");
				System.out.println("            5 - Deletar um Colaborador                               ");
				System.out.println("            6 - Calcular o novo salário                              ");
				System.out.println("            7 - Sair                                                 ");
				System.out.println("                                                                     ");
				System.out.println("*********************************************************************");
				System.out.println(" Entre com a opção desejada:                                         ");
				opcao = leia.nextInt();
				
				if (opcao == 7) {
					System.out.println("\nSistema Finalizado com sucesso!");
					leia.close();
					System.exit(0);
				}
				
				switch (opcao) {
				case 1:
					System.out.println("Cadastrar novo Funcionário\n\n");
					
															
					keyPress();
					
					break;
				case 2:
					System.out.println("Visualizar os dados de todos os funcionários\n\n");
					
					
					
					keyPress();
					
					break;
				case 3:
					
					System.out.println("Consultar os dados de um funcionário\n\n");
							
					
					
					keyPress();
	
					break;
				case 4:
					System.out.println("Atualizar dados do funcionário\n\n");
								
					
					keyPress();

					break;
				case 5:
					System.out.println("Deletar funcionário\n\n");
					
			
					
					keyPress();
					
					break;
				case 6:
					
					System.out.println("Calcular o aumento de salário do funcionário\n\n");
			
					
					keyPress();
					
					break;
				default:
					
					System.out.println("\nOpção Inválida!");
					keyPress();
					
					break;
			}
		}		
		
	}
	
	public static void keyPress() {
		
		try {
			
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
			
		} catch (IOException e) {
			
			System.out.println("Você pressionou uma tecla diferente de enter!");
			
		}finally {
			System.out.println("\n\nPressione Enter para Continuar...");
		
		}
	}

}

