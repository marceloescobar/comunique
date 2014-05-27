package br.gov.sp.sorocaba.comunique.business;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.sorocaba.comunique.dominio.Comunique;
import br.gov.sp.sorocaba.comunique.dominio.Tramitacao;
import br.gov.sp.sorocaba.comunique.dominio.Usuario;
import br.gov.sp.sorocaba.comunique.repository.ComuniqueRepository;
import br.gov.sp.sorocaba.comunique.util.security.AuthenticatedUserCredentials;

@Service
public class ComuniqueBO {

	@Autowired
	private ComuniqueRepository comuniqueRepository;

	public Comunique findByTramitacao(Integer tramitacaoId) {
		Tramitacao tramitacao = new Tramitacao(tramitacaoId);
		Comunique comunique = this.comuniqueRepository.findByTramitacao(tramitacao);

		return comunique;
	}

	@Transactional
	public void salvarComunique(Comunique comunique, Tramitacao tramitacao) {

		comunique.setDataCadastro(new Date());
		comunique.setResponsavel(tramitacao.getProcesso().getInteressado());
		comunique.setTramitacao(tramitacao);

		Usuario usuario = AuthenticatedUserCredentials.obterUsuarioAutenticado();

		comunique.setUsuario(usuario);

		comunique.setStatus(Boolean.TRUE);

		comuniqueRepository.save(comunique);
	}

}
