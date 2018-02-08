package test.br.edu.impacta.ads;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.edu.impacta.ads.Contato;
import br.edu.impacta.ads.ContatoDaoArquivo;

public class ContatoTest {

	ContatoDaoArquivo cdao;
	Contato contato;

	@Before
	public void setData(){
		cdao = new ContatoDaoArquivo("contatos.txt");
		contato = new Contato("Renato", "123");
	}

	@Test
	public void testTest() {
		cdao.inserir(contato);
		assertTrue("O contato nÃ£o foi adicionado.", cdao.existe(contato));
	}
	
	@Test
	public void testeDoBolinhot() {
		
		assertTrue("Existem dados já no banco.", cdao.lerTodos().size() > 0);
	}
	
}
