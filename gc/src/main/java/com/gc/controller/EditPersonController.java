package com.gc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gc.entity.GcTemplate;
import com.gc.entity.PersonEntity;
import com.gc.service.GcEventInterface;
import com.gc.service.GcEvents;
import com.gc.service.GcService;
import com.gc.service.PersonManager;

@Controller
public class EditPersonController {

	@Autowired
	private PersonManager personManager;
	@Autowired
	private GcService gcService;
	@Autowired
	private GcEventInterface gcEvent;
	
	public void setGcEvent(GcEventInterface gcEvent) {
		this.gcEvent = gcEvent;
	}

	public GcService getGcService() {
		return gcService;
	}

	public void setGcService(GcService gcService) {
		this.gcService = gcService;
	}

	public PersonManager getPersonManager() {
		return personManager;
	}

	public void setPersonManager(PersonManager personManager) {
		this.personManager = personManager;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String defaultPage(ModelMap map) {
		return "index";
	}
	@RequestMapping(value = "/add/templates", method = RequestMethod.GET)
	public String addTemplate(ModelMap map) {
		map.addAttribute("template", new GcTemplate());
		
		map.addAttribute("templateList", gcService.getAll("GcTemplate").get("entity"));
		map.addAttribute("parentTemp",gcEvent.getTemplateParents());
		return "addtemplate";
	}
	@RequestMapping(value = "/template/add", method = RequestMethod.POST)
	public String addTemplate(
			@ModelAttribute(value = "template") GcTemplate template,
			BindingResult result) {
		Map<String,Object> addMap=new HashMap<String,Object>();
		addMap.put("entity",template);
		
		gcService.add(addMap);
		return "redirect:/add/templates";
	}

	@RequestMapping(value = "/templates", method = RequestMethod.GET)
	public String templatePage(ModelMap map) {
		/*map.addAttribute("template", new PersonEntity());
		map.addAttribute("templateList", personManager.getAllPerson());
*/
		return "templates";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listEmployees(ModelMap map) {
		
		map.addAttribute("employee", new PersonEntity());
		map.addAttribute("employeeList", personManager.getAllPerson());

		return "editEmployeeList";
	}
	@RequestMapping(value="/edit/{personId}", method = RequestMethod.GET)
	public String editPerson(@PathVariable("personId") Integer personId,ModelMap map){
		map.addAttribute("employee",personManager.getPerson(personId));
		//map.addAttribute("employeeList", personManager.getAllPerson());

		return "editEmployeeList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmployee(
			@ModelAttribute(value = "employee") PersonEntity employee,
			BindingResult result) {
		Map<String,Object> addMap=new HashMap<String,Object>();
		addMap.put("entity",employee);
		
		gcService.add(addMap);
		return "redirect:/list";
	}

	@RequestMapping("/delete/{employeeId}")
	public String deleteEmplyee(@PathVariable("employeeId") Integer employeeId) {
		personManager.deletePerson(employeeId);
		return "redirect:/list";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		return "denied";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		return "logout";
	}
}
