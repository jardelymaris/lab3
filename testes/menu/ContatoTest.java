package menu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de testes para a classe Contato();
 * 
 * @author Jardely Maris da Silva Santos.
 *
 */

public class ContatoTest {

	/**
	 * Representacao de uma contato, no formato Contato.
	 */
	private Contato contato;

	@Before
	public void criaContato() {
	}

	/**
	 * Metodo de teste que cria um contato com o nome nulo, e espera o retorno de
	 * uma excecao NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void criaContatoNomeNulo() {
		contato = new Contato(null, "Jardely", "984653722");
	}

	/**
	 * Metodo de teste que cria um contato com o sobrenome nulo e espera o retorno
	 * de uma excecao NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void criaContatoSobrenomeNulo() {
		contato = new Contato("Jardely", null, "984653722");
	}

	/**
	 * Metodo de teste que cria um contato com o numero do telefone nulo, e espera
	 * um erro NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void criaContatoNumeroNulo() {
		contato = new Contato("Jardely", "Maris", null);
	}

	/**
	 * Metodo de teste que cria um contato com o nome "" (string vazia) e espera uma
	 * excecao IllegalArgumentException.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void criaContatoNomeInvalido() {
		contato = new Contato("", "Jardely", "984653722");
	}

	/**
	 * Metodo de teste que cria um contato com o sobrenome "" (string vazia) e
	 * espera uma exceção IllegalArgumentException.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void criaContatoSobrenomeInvalido() {
		contato = new Contato("Jardely", "", "984653722");
	}

	/**
	 * Metodo de teste que cria um contato com o telefone "" (string vazia) e espera
	 * uma excecao IllegalArgumentException.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void criaContatoTelefoneInvalido() {
		contato = new Contato("Jardely", "Maris", "");
	}

	/**
	 * Metodo de teste do toString().
	 */
	@Test
	public void testaToString() {
		contato = new Contato("Jardely", "Maris", "984653722");
		assertEquals(contato.toString(), "Jardely Maris - 984653722");
	}
}