package menu;

/**
 * Classe responsavel por criar o contato com o nome, sobrenome e telefone.
 * 
 * @author Jardely Maris da Silva Santos 117110274
 *
 */

public class Contato {
	private String nome;
	private String sobrenome;
	private String telefone;

	/**
	 * Contrutor que cria o Contato a partir do nome, sobrenome e telefone. O
	 * construtor tambem lanca uma excecao se o nome, sobrenome ou telefone é nulo
	 * ou se algum deles forem string vazia.
	 * 
	 * @param nome
	 *            o nome da pessoa a ser cadastrada, no formato String.
	 * @param sobrenome
	 *            o sobrenome da pessoa a ser cadastrada, no formato String.
	 * @param telefone
	 *            o telefone da pessoa a ser cadastrada, no formato String.
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if ((nome == null) || (sobrenome == null) || (telefone == null)) {
			throw new NullPointerException();
		} else if ((nome == "") || (sobrenome == "") || (telefone == "")) {
			throw new IllegalArgumentException();
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	/**
	 * Metodo que retorna uma String contendo informacoes do contato no seguinte
	 * formato: "nome sobrenome".
	 * 
	 * @return retorna uma string contendo o nome e sobrenome do contato.
	 */
	public String imprimirContato() {
		return this.nome + " " + this.sobrenome;
	}

	/**
	 * Metodo toString que retorna uma String contendo todas as informações de um
	 * contato, no seguinte formato: "nome sobrenome - telefone
	 * 
	 * @return retorna uma String contendo o nome, sobrenome e o telefone.
	 */
	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome + " - " + this.telefone;
	}
}
