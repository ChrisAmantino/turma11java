package integracao.bancodedados.contatos;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Sort;
import java.util.stream.Stream;

public interface ContatoRepository extends JpaRepository<Contato, Long> {


	//procurar
Contato findFirstByNome(String nome);

	//procurar por nome ,igno// 
List<Contato> findAllByNomeIgnoreCaseContaining(String nome);

//ordem alfabetica
@Query(value = "SELECT c FROM Contato c")
List<Contato> buscaTodosContatosComOrdenacao(Sort sort);

//ordem alfabetica
@Query(value = "SELECT D FROM Contato D")
List<Contato> buscaTodosContatosComOrdenacao2(Sort sort);

//ordem alfabetica
@Query(value = "SELECT c FROM Contato c ORDER BY nome")
Stream<Contato> buscaTodosContatos();


}

