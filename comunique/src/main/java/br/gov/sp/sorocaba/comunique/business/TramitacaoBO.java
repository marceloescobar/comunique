package br.gov.sp.sorocaba.comunique.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.sorocaba.comunique.dominio.Tramitacao;
import br.gov.sp.sorocaba.comunique.repository.TramitacaoRepository;

@Service
public class TramitacaoBO {

	@Autowired
	private TramitacaoRepository tramitacaoRepository;

	public Tramitacao get(Integer id) {
		return tramitacaoRepository.findOne(id);
	}

}
