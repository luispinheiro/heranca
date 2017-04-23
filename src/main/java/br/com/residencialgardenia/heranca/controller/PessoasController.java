package br.com.residencialgardenia.heranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import br.com.residencialgardenia.heranca.model.Pessoa;

@Controller
@RequestMapping("/pessoas")
public class PessoasController {
	
	@RequestMapping("/novo")
	public ModelAndView novo(Pessoa pessoa) {
		ModelAndView mv = new ModelAndView("CadastraPessoa");

		return mv;
	}
}
