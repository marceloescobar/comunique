package br.gov.sp.sorocaba.comunique.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.sp.sorocaba.comunique.dominio.Processo;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Integer> {

	public final static String FIND_ORDER_BY_PROCESSO_QUERY = "SELECT p FROM Processo p order by p.processo desc";
	
	Processo findById(Integer id);
	
	Processo findByProcesso(Integer processo);
	
	@Query(FIND_ORDER_BY_PROCESSO_QUERY)
	Page<Processo> findAllOrderByProcesso(Pageable pageable);
}
