package it.uniroma2.saprClient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.uniroma2.sapr.service.RequestPilot;
import it.uniroma2.sapr.service.RequestDevice;
import it.uniroma2.saprClient.model.ManageService;
import it.uniroma2.saprClient.model.ManageServiceImpl;
import it.uniroma2.saprClient.view.Pilot;
import it.uniroma2.saprClient.view.Device;


@Controller
public class SAPRClientController {
	
	
	@RequestMapping(value = "/addPilot", method = RequestMethod.GET)
	public ModelAndView addPilot(){
		//addPilot è il nome della pagin, command è il nome dell'oggetto pilot nella view
		return new ModelAndView("addPilot", "command", new Pilot());
	}
	
	@RequestMapping(value = "/addedPilot", method = RequestMethod.POST)
	public String addedPilot(@ModelAttribute("addPilot")Pilot pilot, ModelMap model){
		
		ManageService ms = new ManageServiceImpl();
		Boolean result = ms.addPilot(pilot);
		System.out.println("result-->:" + result);
		if (result){
			model.addAttribute("name",pilot.getName());
			model.addAttribute("surname",pilot.getSurname());
			model.addAttribute("license",pilot.getLicensepilot());
			//Il tipo di ritorno è il nome della pagina view che si vuole mostrare
			return "addedPilot";
		}else{
			model.addAttribute("name",pilot.getName());
			model.addAttribute("surname",pilot.getSurname());
			model.addAttribute("license",pilot.getLicensepilot());
			return "errorAddedPilot";
		}
		
	}
        
        @RequestMapping(value = "/addDevice", method = RequestMethod.GET)
	public ModelAndView addDevice(){
		//addPilot è il nome della pagin, command è il nome dell'oggetto pilot nella view
		return new ModelAndView("addDevice", "command", new Device());
	}
	
	
	
}
