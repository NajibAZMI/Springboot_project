package com.ensah.web;

import com.ensah.Model.Person;
import com.ensah.Service.IPersonnesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
@Controller
public class ContactController {
    @Autowired
	private IPersonnesService personnesService;

	@GetMapping("/")
	public String index(Model model) {
		return "form";
	}

	@GetMapping("/AllContacts")
	public String AllContacts(Model model) {
		model.addAttribute("persons", personnesService.getAll());
		return "AllContactsView";
	}

	@PostMapping("/AddContact")
	public String AddContacts(@Valid @ModelAttribute("Person") Person person, BindingResult result, Model model) {
		System.out.println(person);
		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "form";
		}
		personnesService.add(person);
		model.addAttribute("successMessage", "Contact ajouté avec succès!");
		return "form";
	}

	@GetMapping("/Delete/{id}")
	public String Delete(@PathVariable Long id , Model model) {
		System.out.println("Delete "+id);
		personnesService.delete(id);
		model.addAttribute("successMessage", "Contact supprimé avec succès!");
		model.addAttribute("persons", personnesService.getAll());
		return "AllContactsView";
	}

	@GetMapping("/Update/{id}")
	public String Update(@PathVariable Long id , Model model) {
		Person person = personnesService.findById(id);
		if (person != null) {
			model.addAttribute("person", person);
			return "UpdateForm";
		} else {
			return "redirect:/AllContacts";
		}
	}

	@PostMapping("/Update/{id}")
	public String update(@PathVariable Long id, @ModelAttribute Person person, Model model) {
		if (person != null) {
			personnesService.update(person);
			model.addAttribute("successMessage", "Contact mis à jour avec succès!");
		}
		model.addAttribute("persons", personnesService.getAll());
		return "AllContactsView";
	}

}
