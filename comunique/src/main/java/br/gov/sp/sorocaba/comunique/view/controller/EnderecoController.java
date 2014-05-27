package br.gov.sp.sorocaba.comunique.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EnderecoController {

	
	
	@RequestMapping(value = "/endereco/{setor}", method = RequestMethod.GET)
	public String comunique(ModelMap model, @PathVariable String setor) throws Exception {
	
		return "mapa";
	}
	
}
