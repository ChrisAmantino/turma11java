package integracao.bancodedados;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{
	
	//Liga a aplicação com o banco de dados
}
