package rh;

import java.io.IOException;
import java.util.Scanner;

import rh.controller.ColaboradorController;
import rh.model.Colaborador;
import rh.model.Gerente;
import rh.model.Vendedor;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ColaboradorController colaboradores = new ColaboradorController();
				
		int opcao, id, cargo = 0;
		String nome, email = "";
		float salario, bonificacao, comissao, pecentual = 0.0f;
				
		colaboradores.cadastrar(new Gerente(colaboradores.gerarNumero(), "Aimée Thompson", "aimee@gen.com.br", 1, 10000.0f, 500.0f));
		colaboradores.cadastrar(new Vendedor(colaboradores.gerarNumero(), "Marlon Bassoto", "marlon@gen.com.br", 2, 6000.0f, 5.0f));
		
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
					
					System.out.println("Digite o Nome do Funcionário: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					System.out.println("Digite o E-mail do Funcionário: ");
					leia.skip("\\R?");
					email = leia.nextLine();
						
					do {
						System.out.println("Digite o Cargo do Funcionário (1-Gerente/2-vendedor): ");
						cargo = leia.nextInt();
					}while(cargo != 1 && cargo != 2);
					
					System.out.println("Digite o Salário do Funcionário: ");
					salario = leia.nextFloat();
					
					if (cargo == 1) {
						System.out.println("Digite o valor da Bonificação do Gerente (R$): ");
						bonificacao = leia.nextFloat();
						
						colaboradores.cadastrar(new Gerente(colaboradores.gerarNumero(), nome, email, cargo, salario, bonificacao));
						
					}else {
						System.out.println("Digite o percentual da comissão (%): ");
						comissao = leia.nextInt();
						
						colaboradores.cadastrar(new Vendedor(colaboradores.gerarNumero(), nome, email, cargo, salario, comissao));
						
					}
					
					keyPress();
					
					break;
				case 2:
					System.out.println("Visualizar os dados de todos os funcionários\n\n");
					
					colaboradores.listarTodos();
					
					keyPress();
					
					break;
				case 3:
					
					System.out.println("Consultar os dados de um funcionário\n\n");
							
					System.out.println("Digite o Id do Funcionário: ");
					id = leia.nextInt();
					
					colaboradores.buscarPorId(id);
					
					keyPress();
	
					break;
				case 4:
					System.out.println("Atualizar dados do funcionário\n\n");
						
					System.out.println("Digite o Id do Funcionário: ");
					id = leia.nextInt();
										
					System.out.println("Digite o Nome do Funcionário: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					System.out.println("Digite o E-mail do Funcionário: ");
					leia.skip("\\R?");
					email = leia.nextLine();
						
					do {
						System.out.println("Digite o Cargo do Funcionário (1-Gerente/2-vendedor): ");
						cargo = leia.nextInt();
					}while(cargo != 1 && cargo != 2);
					
					System.out.println("Digite o Salário do Funcionário: ");
					salario = leia.nextFloat();
					
					if (cargo == 1) {
						System.out.println("Digite o valor da Bonificação do Gerente (R$): ");
						bonificacao = leia.nextFloat();
						
						colaboradores.atualizar(new Gerente(id, nome, email, cargo, salario, bonificacao));
						
					}else {
						System.out.println("Digite o percentual da comissão (%): ");
						comissao = leia.nextInt();
						
						colaboradores.atualizar(new Vendedor(id, nome, email, cargo, salario, comissao));
						
					}
					
					keyPress();

					break;
				case 5:
					System.out.println("Deletar funcionário\n\n");
					
					System.out.println("Digite o Id do Funcionário: ");
					id = leia.nextInt();
					
					colaboradores.deletar(id);
					
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

