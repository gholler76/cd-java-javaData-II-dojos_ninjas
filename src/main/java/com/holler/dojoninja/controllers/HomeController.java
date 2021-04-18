package com.holler.dojoninja.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.holler.dojoninja.models.Dojo;
import com.holler.dojoninja.models.Ninja;
import com.holler.dojoninja.services.DojoService;
import com.holler.dojoninja.services.NinjaService;

@Controller
public class HomeController {
	private final NinjaService ninjaService; DojoService dojoService;
	public HomeController (NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojo", new Dojo());
		return "dojos.jsp";
	}

	@RequestMapping(value="/createDojo", method=RequestMethod.POST)
	public String createDojo(@ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		dojoService.createDojo(dojo);
		return "redirect:/";
	}

	@RequestMapping("/ninjas")
	public String ninjas(Model model, HttpServletRequest request) {
		model.addAttribute("ninja", new Ninja());
		List<Dojo> dojos = dojoService.allDojos();
		request.setAttribute("dojos", dojos);
		return "ninjas.jsp";
	}

	@RequestMapping(value="/createNinja", method=RequestMethod.POST)
	public String createNinja(@ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		ninjaService.createNinja(ninja);
		return "redirect:/ninjas";
	}

	@RequestMapping("/dojo/{id}")
    public String showDojo(Model model, @PathVariable("id") Long id) {
        Dojo dojo = dojoService.findDojo(id);
        List<Ninja> ninjas= dojo.getNinjas();
        model.addAttribute("dojo", dojo);
        model.addAttribute("ninjas", ninjas);
        return "dojo.jsp";
	}
}
