package integracao.bancodedados.contatos;

import javax.validation.ConstraintViolationException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
//Run with rodará com o spring runner,
//que suporta testes de integração de interfaces

import integracao.bancodedados.ContatoModel;
import integracao.bancodedados.ContatoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest // teste JPA
public class ContatosRepositoryIntegrationTest {

	private ContatoModel contato;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Before
	public void start() {
		contato = new ContatoModel("Gabriel", "011y", "9xxxxxxxxxx9");
	}
	
	//regra, não aceita exceções, é a maneira de especificar,
	//que a execução de um teste lançará uma execução
	@Rule
	public ExpectedException esperadaExcecao = ExpectedException.none();
	
	@Test
	public void salvarComTelNulo() throws Exception {
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O telefone deve ser preenchido");
		
		contato.setTelefone(null);
		contatoRepository.save(contato);
	}
}