package br.gov.sp.sorocaba.comunique.view.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.gov.sp.sorocaba.comunique.business.ComuniqueBO;
import br.gov.sp.sorocaba.comunique.business.TramitacaoBO;
import br.gov.sp.sorocaba.comunique.dominio.Comunique;
import br.gov.sp.sorocaba.comunique.dominio.Tramitacao;

@Controller
@RequestMapping("admin")
public class ComuniqueController {

	@Autowired
	private TramitacaoBO tramitacaoBO;
	
	@Autowired
	private ComuniqueBO comuniqueBO; 

	@RequestMapping(value = "/tramitacao/{id}/comunique", method = RequestMethod.GET)
	public String comunique(ModelMap model, @PathVariable Integer id) throws Exception {

		Comunique comunique = comuniqueBO.findByTramitacao(id);
		
		if (comunique == null){
			
			Tramitacao tramitacao = tramitacaoBO.get(id);
			
			if(tramitacao == null)
				throw new Exception("Erro ao cadastrar comunique. Tramitacao informada nao existe");
			
			comunique = new Comunique();
			comunique.setTramitacao(tramitacao);
		}
		
		
		model.addAttribute("comunique", comunique);

		return "admin/tramitacao/comunique";
	}

	@RequestMapping(value = "/tramitacao/{id}/comunique", method = RequestMethod.POST)
	public String salvarComunique(@PathVariable Integer id,
			@ModelAttribute("comunique") Comunique comunique) {

		
		Tramitacao tramitacao = tramitacaoBO.get(id);
		comuniqueBO.salvarComunique(comunique, tramitacao);
		
		return "admin/sucesso";
	}

}
