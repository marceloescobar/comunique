package br.gov.sp.sorocaba.comunique.view.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.sp.sorocaba.comunique.business.TramitacaoBO;
import br.gov.sp.sorocaba.comunique.dominio.Tramitacao;

@Controller
public class ComuniqueController {

	@Autowired
	private TramitacaoBO tramitacaoBO;

	@RequestMapping(value = "/tramitacao/{id}/comunique", method = RequestMethod.GET)
	public String comunique(ModelMap model, @PathVariable Integer id) {

		Tramitacao tramitacao = tramitacaoBO.get(id);
		model.addAttribute("tramitacao", tramitacao);

		return "admin/tramitacao/comunique";
	}
}
