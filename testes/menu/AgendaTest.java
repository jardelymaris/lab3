package menu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Representacao do conjunto de testes da classe agenda.
 * 
 * @author Jardely Maris da Silva Santos 117110274
 *
 */
public class AgendaTest {

	/**
	 * Representacao de uma agenda, no formato Agenda.
	 */
	private Agenda agendaTeste;

	/**
	 * Cria uma agenda.
	 */
	@Before
	public void setUp() {
		this.agendaTeste = new Agenda();
	}

	/**
	 * Metodo que testa o cadastro um contato em uma posicao vazia da agenda.
	 */
	@Test
	public void cadastraContatoPosVazia() {
		this.agendaTeste.cadastraContato(1, "Luna", "Maris", "123");
	}

	/**
	 * Metodo que testa se a String gerada pela funcao exibirContato esta esperado.
	 */
	@Test
	public void exibeContatoTeste() {
		this.agendaTeste.cadastraContato(1, "Luna", "Maris", "123");
		assertEquals("O contato nao esta sendo exibido como esperado", this.agendaTeste.exibirContato(1),
				"Luna Maris - 123");
	}

	/**
	 * Metodo que testa a impossibilidade de exibir um contato em posicao inferior
	 * ao limite da agenda.
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void exibeContatoPosInvalida0() {
		this.agendaTeste.exibirContato(0);
	}

	/**
	 * Metodo que testa a impossibilidade de exibir um contato em posicao superior
	 * ao limite da agenda.
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void exibeContatoPosInvalida101() {
		this.agendaTeste.exibirContato(101);
	}

	/**
	 * Metodo que testa a impossibilidade de exibir um contato null.
	 */
	@Test(expected = NullPointerException.class)
	public void testExibeContato() {
		this.agendaTeste.exibirContato(50);
	}

	/**
	 * Metodo que testa a possibilidade de sobrescrever um contato na agenda.
	 */
	@Test
	public void sobrescreveContato() {
		this.agendaTeste.cadastraContato(1, "Luna", "Maris", "123");
		this.agendaTeste.cadastraContato(1, "Adao", "Henrique", "999");
		assertEquals("Erro na sobreescricao de contato!", agendaTeste.exibirContato(1), "Adao Henrique - 999");
	}

	/**
	 * Metodo que testa a impossibilidade de cadastrar um contato em posicao que
	 * excede o limite inferior do indice da agenda.
	 */
	@Test
	public void cadastraContatoPosInvalida0() {
		assertFalse(this.agendaTeste.cadastraContato(0, "Luna", "Maris", "123"));
	}

	/**
	 * Metodo que testa a impossibilidade de cadastrar um contato em posicao que
	 * excede o limite superior do indice da agenda.
	 */
	@Test
	public void cadastraContatoPosInvalida101() {
		assertFalse(this.agendaTeste.cadastraContato(101, "Luna", "Maris", "123"));
	}

	/**
	 * Metodo que testa a possibilidade de cadastrar um contato em posicao limite
	 * do indice da agenda.
	 */
	@Test
	public void cadastraContatoPosLimite() {
		this.agendaTeste.cadastraContato(100, "Luna", "Maris", "123");
	}

	/**
	 * Metodo que testa se o formato da String gerada pela funcao toString esta como
	 * esperado.
	 */
	@Test
	public void agendaToString() {
		this.agendaTeste.cadastraContato(1, "Luna", "Maris", "123");
		this.agendaTeste.cadastraContato(2, "Adao", "Henrique", "999");
		assertEquals("A String nao esta correta!", agendaTeste.toString(),
				"1 - Luna Maris - 123\n2 - Adao Henrique - 999\n");
	}

}
