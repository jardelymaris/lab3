package menu;

/**
 * Classe responsavel por criar a Agenda e contem metodos de exibicao, listagem
 * e cadastro de contatos.
 * 
 * @author Jardely Maris da Silva Santos 117110274
 *
 */
public class Agenda {

	private Contato[] contatos;

	/**
	 * Construtor que cria um array com 100 posicoes.
	 */
	public Agenda() {
		contatos = new Contato[100];
	}

	/**
	 * Metodo que cadastra um contato na agenda a partir da posicao, nome, sobrenome
	 * e telefone, e verifica se e possivel cadastrar na posicao indicada.
	 * 
	 * @param posicao
	 *            a posicao onde o contato sera cadastrado, no tipo inteiro.
	 * @param nome
	 *            o nome da pessoa que sera cadastrada na agenda, no tipo String.
	 * @param sobrenome
	 *            sobrenome da pessoa que sera cadastrada na agenda, no tipo String.
	 * @param telefone
	 *            o telefone do contato a ser cadastrado, no tipo String
	 * @return um boleano auxiliar que indica se o cadastro foi realizado ou nao.
	 */
	public boolean cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		boolean aux;
		if (posicao >= 1 && posicao <= 100) {
			Contato novoContato = new Contato(nome, sobrenome, telefone);
			contatos[posicao - 1] = novoContato;
			aux = true;
		} else {
			aux = false;
		}
		return aux;
	}

	/**
	 * Metodo que lista os contatos da agenda.
	 * 
	 * @return uma String que contem todos todos os contatos da agenda.
	 */
	public String listarContatos() {
		String listagemDeContatos = "";
		for (int i = 0; i < contatos.length - 1; i++) {
			int p = i + 1;
			if (contatos[i] != null) {

				listagemDeContatos += p + " - " + contatos[i].imprimirContato() + "\n";
			}
		}
		return listagemDeContatos;
	}

	/**
	 * Metodo que exibe um contato a partir da posicao e lanca excecoes se a posicao
	 * estiver fora do intervalo do array da agenda.
	 * 
	 * @param posicao
	 *            a posicao do contato que devera ser exbido.
	 * @return o uma String contendo o contato da posicao indicada.
	 */
	public String exibirContato(int posicao) {
		if (contatos[posicao - 1] == null) {
			throw new NullPointerException();

		} else if (posicao > 100 || posicao < 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return contatos[posicao - 1].toString();
	}

	/**
	 * Metodo toString que retorna uma String contendo as informacoes da agenda.
	 * 
	 * @return uma String contendo infomacoes da agenda no formato: "posicao - nome
	 *         sobrenome - telefone".
	 */
	public String toString() {
		String stringAgenda = "";
		for (int pos = 0; pos < this.contatos.length; pos++) {
			if (this.contatos[pos] != null) {
				stringAgenda += (pos + 1) + " - " + contatos[pos].toString() + "\n";
			}
		}
		return stringAgenda;

	}
}