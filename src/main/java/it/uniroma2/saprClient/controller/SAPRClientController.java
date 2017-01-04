package it.uniroma2.saprClient.controller;

import it.uniroma2.sapr.service.CheckElement;
import it.uniroma2.sapr.service.Device;
import it.uniroma2.sapr.service.Opzione;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.uniroma2.sapr.service.RequestPilot;
import it.uniroma2.sapr.service.ResponseDevice;
import it.uniroma2.sapr.service.ResponseFlightPlan;
import it.uniroma2.sapr.service.ResponseSapr;
import it.uniroma2.saprClient.model.ManageService;
import it.uniroma2.saprClient.model.ManageServiceImpl;
import it.uniroma2.saprClient.view.FlightPlan;
import it.uniroma2.saprClient.view.FlightPlanWrapper;
import it.uniroma2.saprClient.view.Pilot;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;
/**
 * Questa classe è il controllere dell' MVC. Ogni richiesta deve passare per questo controller
 * 
 * @author Danilo Butrico
 *
 */
@Controller
public class SAPRClientController {
	private static String clazz = "SAPRClientController";
	private static Logger log = Logger.getRootLogger();
	
	@RequestMapping(value = "/pilot", method = RequestMethod.GET)
	public String redirectAdmin() {
		return "pilot";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String redirectPilot() {
		return "admin";
	}	
	
	@RequestMapping(value = "/addPilot", method = RequestMethod.GET)
	public ModelAndView addPilot(){
		//addPilot è il nome della pagin, command è il nome dell'oggetto pilot nella view
		return new ModelAndView("addPilot", "command", new Pilot());
	}
	 
	@RequestMapping(value = "/addedPilot", method = RequestMethod.POST)
	public String addedPilot(@ModelAttribute("addPilot")Pilot pilot, ModelMap model){
		String method = "addedPilot";
		log.debug(String.format("%s-%s:: Start", clazz,method));
		ManageService ms = new ManageServiceImpl();
		Boolean result = ms.addPilot(pilot);
		System.out.println("result-->:" + result);
//		log.debug(String.format("%s-%s:: Result [%b]", clazz,method,result));
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
            //addDevice è il nome della pagina, command è il nome dell'oggetto device nella view
            return new ModelAndView("addDevice", "command", new Device());
	}
        
	@RequestMapping(value = "/addedDevice", method = RequestMethod.POST)
	public String addedDevice(HttpServletRequest request, ModelMap model){
            String method = "addedDevice";
            log.debug(String.format("%s-%s:: Start", clazz,method));
            System.out.println("ENTRO NELLA POST");
            System.out.println("ENTRO NELLA POST");

            ManageService ms = new ManageServiceImpl();

            Device device = new Device();
            ArrayList<CheckElement> arr_ck = new ArrayList<CheckElement>();
            CheckElement check = new CheckElement();
            // si fa prima la prova su due elementi poi si farà il ciclo
            check.setValue(request.getParameter("check1"));
            arr_ck.add(check);
            check.setValue(request.getParameter("check2"));
            arr_ck.add(check);

            device.setIdDevice(Integer.parseInt(request.getParameter("id")));
            device.setModel(request.getParameter("model"));
            device.setPilotLicense(request.getParameter("pilotLicense"));
            device.setProducer(request.getParameter("producer"));
            device.setType(request.getParameter("type"));
            device.setWeight(Integer.parseInt(request.getParameter("weight")));
            device.setCheckDevice(arr_ck);

            Boolean result = ms.addDevice(device);
            System.out.println("Riempito tutto");
            if(result)
                return "addedDevice";
            else return "errorAddedDevice";
	}

        
	public String addedDeviceOld(@ModelAttribute("addDevice")Device device, ModelMap model){
            String method = "addedDevice";
            log.debug(String.format("%s-%s:: Start", clazz,method));
            ManageService ms = new ManageServiceImpl();
            Boolean result = ms.addDevice(device);
            System.out.println("result-->:" + result);
            if (result){
                    model.addAttribute("id",device.getIdDevice());
                    model.addAttribute("model",device.getModel());
                    model.addAttribute("producer",device.getProducer());
                    model.addAttribute("license",device.getPilotLicense());
                    //Il tipo di ritorno è il nome della pagina view che si vuole mostrare
                    return "addedDevice";
            }else{
                    model.addAttribute("id",device.getIdDevice());
                    model.addAttribute("model",device.getModel());
                    model.addAttribute("producer",device.getProducer());
                    model.addAttribute("license",device.getPilotLicense());
                    return "errorAddedDevice";
            }
		
	}
        
	@RequestMapping(value = "/removeDevice", method = RequestMethod.GET)
	public ModelAndView removeDevice(HttpServletRequest servlet){
            //Qui serve richiamare il webService per farsi dare la lista dei device del pilota
                
            //String pilotLicense = (String) servlet.getSession().getAttribute("licensePilot");
            // DA CAMBIARE PERCHE DEVE PRENDERE DALLA SESSION IL PILOTA
            String pilotLicense = "0000000001";
            ManageService ms = new ManageServiceImpl();
            List<ResponseDevice> devices = ms.selectDevices(pilotLicense);
            return new ModelAndView("removeDevice", "command", devices);
	}
	
	@RequestMapping(value = "/removedDevice", method = RequestMethod.POST)
	public String removedDevice(@ModelAttribute("removeDevice")Device device, ModelMap model){
            String method = "removedDevice";
            log.debug(String.format("%s-%s:: Start", clazz,method));
            ManageService ms = new ManageServiceImpl();
            Boolean result = ms.removeDevice(device);
            System.out.println("result-->:" + result);
            log.debug(String.format("%s-%s:: Result [%b]", clazz,method,result));
            if (result){
                    //Il tipo di ritorno è il nome della pagina view che si vuole mostrare
                    model.addAttribute("id",device.getIdDevice());
                    log.debug(String.format("%s-%s:: End", clazz,method));
                    return "removedDevice";
            }else{
                    model.addAttribute("id",device.getIdDevice());
                    log.debug(String.format("%s-%s:: End", clazz,method));
                    return "errorRemovedDevice";
            }

	}
      
        @RequestMapping(value = "/addFlightPlan", method = RequestMethod.GET)
	public ModelAndView addFlightPlan(HttpServletRequest servlet){
                /*
		 * In questo metodo occorre richiamare i WebMethod del service per ottentere la lista dei 
		 * SAPR del pilota e la lista dei Device del pilota. Per fare ciò dobbiamo avere la licensa
		 * del pilota che abbiamo detto riceveremo tramite sessione e che infatti ho messo come input
		 * nel metodo
		*/
		//questo valore dovrà essere inserito nella session in un altro metodo del controller
                //String pilotLicense = (String) servlet.getSession().getAttribute("licensePilot");
		ManageService ms = new ManageServiceImpl();
		FlightPlanWrapper flight = ms.popoulateFlighPlanWrapper("0000000001");
                System.out.println("Sapr of Pilot"+flight.getSaprsOfPilot().get(0).toString());
                System.out.println("Device of Pilot"+flight.getDevicesOfPilot().get(0).getProducer());
		return new ModelAndView("addFlightPlan","model", flight);
	}
	 
       /* 
	@RequestMapping(value = "/addedFlightPlan", method = RequestMethod.POST)
	public String addedFlightPlan(@ModelAttribute("addFlightPlan")FlightPlan flightPlan, ModelMap model){
		
		ManageService ms = new ManageServiceImpl();
		Boolean result = ms.addFlightPlan(flightPlan);
		System.out.println("result-->:" + result);
		if (result){
			model.addAttribute("destinations",flightPlan.getDestinations());
                        model.addAttribute("departure",flightPlan.getDeparture());
                        model.addAttribute("dateDeparture",flightPlan.getDateDeparture());
                        model.addAttribute("idSapr",flightPlan.getIdSapr());

			//Il tipo di ritorno è il nome della pagina view che si vuole mostrare
			return "addedFlightPlan";
		}else{
			model.addAttribute("destinations",flightPlan.getDestinations());
                        model.addAttribute("departure",flightPlan.getDeparture());
                        model.addAttribute("dateDeparture",flightPlan.getDateDeparture());
                        model.addAttribute("idSapr",flightPlan.getIdSapr());
			return "errorAddedFlightPlan";
		}
		
	}
	*/
        @RequestMapping(value = "/addedFlightPlan", method = RequestMethod.POST)
	public String addedFlightPlan(@ModelAttribute("addFlightPlan")FlightPlanWrapper flightPlan, ModelMap model){
		
		ManageService ms = new ManageServiceImpl();
		Boolean result = ms.addFlightPlan(flightPlan.getFlight());
		System.out.println("result-->:" + result);
		if (result){
			model.addAttribute("destinations",flightPlan.getFlight().getDestinations());
                        model.addAttribute("departure",flightPlan.getFlight().getDeparture());
                        model.addAttribute("dateDeparture",flightPlan.getFlight().getDateDeparture());
                        model.addAttribute("idSapr",flightPlan.getFlight().getIdSapr());

			//Il tipo di ritorno è il nome della pagina view che si vuole mostrare
			return "addedFlightPlan";
		}else{
			model.addAttribute("destinations",flightPlan.getFlight().getDestinations());
                        model.addAttribute("departure",flightPlan.getFlight().getDeparture());
                        model.addAttribute("dateDeparture",flightPlan.getFlight().getDateDeparture());
                        model.addAttribute("idSapr",flightPlan.getFlight().getIdSapr());
			return "errorAddedFlightPlan";
		}
		
	}
        

	@RequestMapping(value = "/removePilot", method = RequestMethod.GET)
	public ModelAndView removePilot(){
		//TODO: Qui serve richiamare il webService per farsi dare la lista dei piloti che andrà
		//messa al posto di new Pilot()
		return new ModelAndView("removePilot", "command", new Pilot());
	}
	
	@RequestMapping(value = "/removedPilot", method = RequestMethod.POST)
	public String removedPilot(@ModelAttribute("removePilot")Pilot pilot, ModelMap model){
		String method = "removedPilot";
		log.debug(String.format("%s-%s:: Start", clazz,method));
		ManageService ms = new ManageServiceImpl();
		Boolean result = ms.removePilot(pilot);
		System.out.println("result-->:" + result);
		log.debug(String.format("%s-%s:: Result [%b]", clazz,method,result));
		if (result){
			//Il tipo di ritorno è il nome della pagina view che si vuole mostrare
			log.debug(String.format("%s-%s:: End", clazz,method));
			return "removedPilot";
		}else{
			log.debug(String.format("%s-%s:: End", clazz,method));
			return "errorRemovedPilot";
		}
		
	}
        
        @RequestMapping(value = "/removeFlightPlan", method = RequestMethod.GET)
	public ModelAndView removeFlightPlan(){
		//TODO: Qui serve richiamare il webService per farsi dare la lista dei piloti che andrà
		//messa al posto di new Pilot()
		return new ModelAndView("removeFlightPlan", "command", new FlightPlan());
	}
	
	@RequestMapping(value = "/removedFlightPlan", method = RequestMethod.POST)
	public String removedFlightPlan(@ModelAttribute("removeFlightPlan")FlightPlan flightPlan, ModelMap model){
		String method = "removedFlightPlan";
		log.debug(String.format("%s-%s:: Start", clazz,method));
		ManageService ms = new ManageServiceImpl();
		Boolean result = ms.removeFlightPlan(flightPlan);
		System.out.println("result-->:" + result);
		log.debug(String.format("%s-%s:: Result [%b]", clazz,method,result));
		if (result){
			//Il tipo di ritorno è il nome della pagina view che si vuole mostrare
			log.debug(String.format("%s-%s:: End", clazz,method));
			return "removedFlightPlan";
		}else{
			log.debug(String.format("%s-%s:: End", clazz,method));
			return "errorRemovedFlightPlan";
		}
		
	}

}
