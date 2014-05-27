package br.gov.sp.sorocaba.comunique.view.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ErroController {

	@ExceptionHandler(Exception.class)
	public String handleCustomException(Exception ex, ModelMap model) {

		model.addAttribute("error", ex.getMessage());

		return "admin/error";

	}
}
