package br.gov.sp.sorocaba.comunique.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.sorocaba.comunique.dominio.Processo;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Integer> {

	
	Processo findById(Integer id);
	
	Processo findByProcesso(Integer processo);
	
	Page<Processo> findOrderByProcesso(Pageable pageable);
}
