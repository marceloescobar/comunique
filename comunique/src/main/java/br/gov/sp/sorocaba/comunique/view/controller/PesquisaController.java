package br.gov.sp.sorocaba.comunique.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PesquisaController {

	@RequestMapping(value = "/pesquisa", method = RequestMethod.GET)
	public String form(){
		
		return "pesquisa";
	}
}
