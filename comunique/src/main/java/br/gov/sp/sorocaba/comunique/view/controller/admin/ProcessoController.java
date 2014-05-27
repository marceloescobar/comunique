package br.gov.sp.sorocaba.comunique.view.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.sp.sorocaba.comunique.business.ProcessoBO;
import br.gov.sp.sorocaba.comunique.dominio.Processo;

@Controller
@RequestMapping("admin")
public class ProcessoController {

	@Autowired
	private ProcessoBO processoBO;
	
	@RequestMapping(value = "/processos", method = RequestMethod.GET)
	public String listar(ModelMap model,@PageableDefaults(value = 40, pageNumber = 0) Pageable pageable){
		
		Page<Processo> pagina = processoBO.buscarProcessos(pageable);
		int current = pagina.getNumber() + 1;
		
		model.addAttribute("pagina", pagina);
		model.addAttribute("currentIndex", current);
		
		
		return "admin/processo/lista";
	}
	
	@RequestMapping(value = "/processo/{id}", method = RequestMethod.GET)
	public String obterProcesso(ModelMap model, @PathVariable Integer id){
	
		Processo processo = processoBO.get(id);
		
		if (processo == null){
			model.addAttribute("erro", "processo nao encontrado");
			return "admin/error";
			
		}else{
			model.addAttribute("processo", processo);
			
			return "admin/processo/detalhe";	
		}
	}
}
