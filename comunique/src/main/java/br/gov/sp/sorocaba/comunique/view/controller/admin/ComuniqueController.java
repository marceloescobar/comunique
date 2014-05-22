package br.gov.sp.sorocaba.comunique.view.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.sp.sorocaba.comunique.dominio.Processo;

@Controller
public class ComuniqueController {

	
	@RequestMapping(value = "/tramitacao/{id}/comunique", method = RequestMethod.GET)
	public String comunique(ModelMap model, @PathVariable Integer id){
	
		//Processo processo = processoBO.get(id);
		//model.addAttribute("processo", processo);
		
		return "admin/tramitacao/comunique";
	}
}
