package br.gov.sp.sorocaba.comunique.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.gov.sp.sorocaba.comunique.dominio.Processo;
import br.gov.sp.sorocaba.comunique.repository.ProcessoRepository;

@Service
public class ProcessoBO {

	@Autowired
	private ProcessoRepository processoRepository;
	
	public Processo get(Integer id){
		return processoRepository.findOne(id);
	}

	public Page<Processo> buscarProcessos(Pageable pageable) {
		
		//return processoRepository.findAll(pageable);
		return processoRepository.findAllOrderByProcesso(pageable);
		//return processoRepository.findOrderByProcesso(pageable);
	}
	
	/*private Sort sortByProcessoDesc() {
        return new Sort(Sort.Direction.DESC, "processo");
    }*/
}
