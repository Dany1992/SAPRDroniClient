package it.uniroma2.saprClient.controller;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import it.uniroma2.sapr.service.Opzione;
import org.apache.log4j.Logger;
//import org.eclipse.jdt.internal.compiler.ast.AND_AND_Expression;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.uniroma2.sapr.service.Opzione;
import it.uniroma2.sapr.service.ResponseDevice;
import it.uniroma2.sapr.service.ResponseSapr;
import it.uniroma2.saprClient.model.ManageService;
import it.uniroma2.saprClient.model.ManageServiceImpl;
import it.uniroma2.saprClient.view.Device;
import it.uniroma2.saprClient.view.FlightPlan;
import it.uniroma2.saprClient.view.FlightPlanPilot;
import it.uniroma2.saprClient.view.FlightPlanWrapper;
import it.uniroma2.saprClient.view.Pilot;
import it.uniroma2.saprClient.view.Sapr;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	private static final AtomicInteger idSaprCounter = new AtomicInteger();
	private static final AtomicInteger idNoteCounter = new AtomicInteger();
	private static final AtomicInteger idDeviceCounter = new AtomicInteger();
	
        /*
	@RequestMapping(value = "/pilot", method = RequestMethod.GET)
	public String redirectPilot(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		session.setAttribute("license", request.getParameter("license"));
		System.out.println("license = " + request.getParameter("license"));
		
		return "pilot";
	}
	*/
        
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String redirectAdmin(HttpServletRequest request) {
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
	 @RequestMapping(value = "/addSapr", method = RequestMethod.GET)
		public ModelAndView addSapr(HttpServletRequest request){
		 		Sapr sapr = new Sapr();
		 		String licensePilot = (String) request.getSession().getAttribute("license");
		 		sapr.setPilotLicense(licensePilot);
		 		return new ModelAndView("addSapr", "command", sapr);
		}
	        
		@RequestMapping(value = "/addedSapr", method = RequestMethod.POST)
		public String addedSapr(HttpServletRequest request, ModelMap model){
	            String method = "addedSapr";
	            log.debug(String.format("%s-%s:: Start", clazz,method));
	            String licensePilot = (String) request.getSession().getAttribute("license");
	            ManageService ms = new ManageServiceImpl();

	            Sapr sapr = new Sapr();
	            ArrayList<String> arr_ck = new ArrayList<String>();
	            arr_ck.add(request.getParameter("check1"));
	            arr_ck.add(request.getParameter("check2"));
	            arr_ck.add(request.getParameter("check3"));
	            arr_ck.add(request.getParameter("check4"));
	            arr_ck.add(request.getParameter("check5"));
	            System.out.println("id sapr" + idSaprCounter.get());
	            sapr.setIdSapr(idSaprCounter.getAndIncrement());
	            sapr.setModel(request.getParameter("model"));
	            sapr.setProducer(request.getParameter("producer"));
	            sapr.setPilotLicense(licensePilot);
	            sapr.setWeight(Integer.parseInt(request.getParameter("weight")));	            
	            sapr.setHeavyweight(Integer.parseInt(request.getParameter("heavyweight")));	
	            sapr.setMaxDistance(Integer.parseInt(request.getParameter("maxdistance")));
	            sapr.setMaxHeight(Integer.parseInt(request.getParameter("maxheight")));
	            sapr.setBattery(request.getParameter("battery"));	            
	            sapr.setCheckSapr(arr_ck);
	            System.out.println("The request is:" + sapr.toString());
	            Boolean result = ms.addSapr(sapr);
	            if(result){
	            	model.addAttribute("idSapr", sapr.getIdSapr());
	            	model.addAttribute("producer", sapr.getProducer());
	            	model.addAttribute("licensepilot", sapr.getPilotLicense());
	            	model.addAttribute("model", sapr.getModel());
	            	return "addedSapr";
	            }else{
	            	model.addAttribute("idSapr", sapr.getIdSapr());
	            	model.addAttribute("model", sapr.getModel());
	            	model.addAttribute("producer", sapr.getProducer());
	            	model.addAttribute("pilotlicense", sapr.getPilotLicense());
	            	return "errorAddedSapr";
	            }
		}
		
		/*@RequestMapping(value = "/removeSapr", method = RequestMethod.GET)
		public ModelAndView removeSapr(HttpServletRequest servlet){
	            
		}*/
		
		@RequestMapping(value = "/removedSapr", method = RequestMethod.POST)
		public String removedSapr(@ModelAttribute("removeSapr")Sapr sapr, ModelMap model){
	            String method = "removedSapr";
	            log.debug(String.format("%s-%s:: Start", clazz,method));
	            ManageService ms = new ManageServiceImpl();
	            Boolean result = ms.removeSapr(sapr);
	            System.out.println("result-->:" + result);
	            log.debug(String.format("%s-%s:: Result [%b]", clazz,method,result));
	            if (result){
	                    //Il tipo di ritorno � il nome della pagina view che si vuole mostrare
	                    model.addAttribute("id",sapr.getIdSapr());
	                    log.debug(String.format("%s-%s:: End", clazz,method));
	                    return "removedSapr";
	            }else{
	                    model.addAttribute("id",sapr.getIdSapr());
	                    log.debug(String.format("%s-%s:: End", clazz,method));
	                    return "errorRemovedSapr";
	            }

		}


        @RequestMapping(value = "/addDevice", method = RequestMethod.GET)
	public ModelAndView addDevice(){
            return new ModelAndView("addDevice", "command", new Device());
	}
        
	@RequestMapping(value = "/addedDevice", method = RequestMethod.POST)
	public String addedDevice(HttpServletRequest request, ModelMap model){
            String method = "addedDevice";
            log.debug(String.format("%s-%s:: Start", clazz,method));
            String licensePilot = (String) request.getSession().getAttribute("license");
            ManageService ms = new ManageServiceImpl();

            Device device = new Device();
            ArrayList<String> arr_ck = new ArrayList<String>();
            arr_ck.add(request.getParameter("check1"));
            arr_ck.add(request.getParameter("check2"));
            arr_ck.add(request.getParameter("check3"));
            arr_ck.add(request.getParameter("check4"));
            arr_ck.add(request.getParameter("check5"));
            
            device.setIdDevice(idDeviceCounter.getAndIncrement());
            device.setModel(request.getParameter("model"));
            device.setPilotLicense(licensePilot);
            device.setProducer(request.getParameter("producer"));
            device.setType(request.getParameter("type"));
            device.setWeight(Integer.parseInt(request.getParameter("weight")));
            device.setCheckDevice(arr_ck);

            Boolean result = ms.addDevice(device);
            if(result){
            	model.addAttribute("producer", device.getProducer());
            	model.addAttribute("licensepilot", device.getPilotLicense());
            	model.addAttribute("model", device.getModel());
            	return "addedDevice";
            }else{
            	model.addAttribute("model", device.getModel());
            	model.addAttribute("producer", device.getProducer());
            	model.addAttribute("pilotlicense", device.getPilotLicense());
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
		ManageService ms = new ManageServiceImpl();
		String licensePilot = (String) servlet.getSession().getAttribute("license");
		FlightPlanWrapper flight = ms.popoulateFlighPlanWrapper(licensePilot);
		return new ModelAndView("addFlightPlan","model", flight);
	}


    @RequestMapping(value = "/addedFlightPlan", method = RequestMethod.POST)
	public String addedFlightPlan(HttpServletRequest request, ModelMap model){
		ManageService ms = new ManageServiceImpl();
		FlightPlan flightPlan = new FlightPlan();
		flightPlan.setIdNote(idSaprCounter.getAndIncrement());
		ms.setFlightPlan(request,flightPlan);
		
		Boolean result = ms.addFlightPlan(flightPlan);
		System.out.println("result-->:" + result);
		if (result){
			model.addAttribute("destinations",flightPlan.getDestinations());
            model.addAttribute("departure",flightPlan.getDeparture());
            model.addAttribute("dateDeparture",flightPlan.getDateDeparture());
            model.addAttribute("idSapr",flightPlan.getIdSapr());
			return "addedFlightPlan";
		}else{
			model.addAttribute("destinations",flightPlan.getDestinations());
            model.addAttribute("departure",flightPlan.getDeparture());
            model.addAttribute("dateDeparture",flightPlan.getDateDeparture());
            model.addAttribute("idSapr",flightPlan.getIdSapr());
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
    
	@RequestMapping(value = "/activeSAPR", method = RequestMethod.GET)
	public ModelAndView activeSAPR(){
		
		ManageService ms = new ManageServiceImpl();
		
		ArrayList<ResponseSapr> SAPRsDisable = ms.getSAPRs(Opzione.DISABLED);
		
		return new ModelAndView("activeSAPR", "model", SAPRsDisable);
	}
	
	@RequestMapping(value = "/activedSAPR", method = RequestMethod.POST)
	public String activedSAPR(HttpServletRequest request, ModelMap model){
		String method = "activedSAPR";
		log.debug(String.format("%s-%s:: Start", clazz,method));
		
		String[] saprWillActive = request.getParameterValues("listSapr");
		if (saprWillActive != null && saprWillActive.length == 0){
			return "addedFlightPlan"; 
		}
		log.debug(String.format("%s-%s:: sapr:[%s]", clazz,method,saprWillActive.toString()));
		ManageService ms = new ManageServiceImpl();
		ArrayList<String> saprNotActivated = ms.setAndActiveSaprs(saprWillActive);
		
		if (saprNotActivated.isEmpty()){
			return "activedSAPR";
		}else{
			return "errorActivedSapr";
		}
	}
	
	
	
    @RequestMapping(value = "/removeFlightPlan", method = RequestMethod.GET)
	public ModelAndView removeFlightPlan(){
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
        
        @RequestMapping(value = "/pilot", method = RequestMethod.GET)
	public ModelAndView flightPlanPilot(HttpServletRequest request){
		//TODO: Qui serve richiamare il webService per farsi dare la lista dei piani di volo del pilota che prendo il suo Id tramite Session che andrà
                //prima eseguo la query dei sapr del pilot e poi mi faccio ritornare i piani di volo di tutti i SAPR del Pilot
		ArrayList<FlightPlanPilot> flightSapr = new ArrayList<FlightPlanPilot>();
                String licensePilot = (String) request.getSession().getAttribute("license");
                if(licensePilot==null){
                    HttpSession session = request.getSession(true);
                    session.setAttribute("license", request.getParameter("license"));
                    System.out.println("license = " + request.getParameter("license"));
                    licensePilot=request.getParameter("license");
                }
                ManageService ms = new ManageServiceImpl(); 
                ArrayList<ResponseSapr> sapr=ms.getSaprsOfPilot(Opzione.ENABLED,licensePilot);
                for(int i=0;i<sapr.size();i++){
                    flightSapr.add(new FlightPlanPilot(ms.getFlightPlanBySapr(sapr.get(i).getIdSapr())));
                }
                System.out.println(flightSapr);
                return new ModelAndView("pilot","model",flightSapr);
	}

}
