package carreiras.com.github.vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carreiras.com.github.vendas.domain.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
