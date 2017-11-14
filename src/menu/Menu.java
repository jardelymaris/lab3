package menu;

import java.util.Scanner;

/**
 * A classe Menu e responsavel pela interacao com o usuario.
 * @author Jardely Maris da Silva Santos 117110274
 *
 */
public class Menu {

	private static Scanner sc = new Scanner(System.in);
	private static Agenda agenda = new Agenda();

	public static void main(String[] args) {
		boolean aux = true;

			while (aux) {
				exibirMenu();
				String opcao = sc.next();

				if (opcao.equals("S")) {
					aux = false;
					
				} else if (opcao.equals("C")) {
					if (recebeDadosParaCadastro() == true) {
					System.out.println("CADASTRO REALIZADO!");
					} else {
						System.out.println("POSICAO INVALIDA!");
					}

				} else if (opcao.equals("L")) {
					System.out.println(agenda.listarContatos());

				} else if (opcao.equals("E")) {
					System.out.println(recebeDadosParaExibirContato());

				} else {
					System.out.println("OPCAO INVALIDA!");
				}
			
			}
		
		
		sc.close();
	}
	
	/**
	 * Metodo privado da classe Menu, responsavel por exibir o menu.
	 */
	private static void exibirMenu() {
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contato");
		System.out.println("(E)xibir Contato");
		System.out.println("(S)air");
		System.out.print("Opção> ");
	}
	
	/**
	 * Metodo privado da classe Menu responsavel por receber os dados do contato a ser cadastrado.
	 * @return um boolean que indica se possivel realizar o cadastro ou nao.
	 */
	private static boolean recebeDadosParaCadastro() {
		System.out.print("Posição: ");
		int posicao = sc.nextInt();
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Sobrenome: ");
		String sobrenome = sc.next();
		System.out.print("Telefone: ");
		String telefone = sc.next();
		return agenda.cadastraContato(posicao, nome, sobrenome, telefone);
	}
	
	/**
	 * Metodo privado da classe menu responsavel por receber a posicao para a exibicao do contato.
	 * @return uma String com os dados do contato da posicao indicada.
	 */
	private static String recebeDadosParaExibirContato() {
		System.out.print("Contato> ");
		int posicao = sc.nextInt();
		return agenda.exibirContato(posicao);
	}

}
