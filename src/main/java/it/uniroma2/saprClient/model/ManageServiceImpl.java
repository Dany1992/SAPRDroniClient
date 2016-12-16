package it.uniroma2.saprClient.model;

import java.util.logging.Logger;

import it.uniroma2.sapr.service.Exception_Exception;
import it.uniroma2.sapr.service.Operation;
import it.uniroma2.sapr.service.RequestFlightPlan;
import it.uniroma2.sapr.service.RequestPilot;
import it.uniroma2.sapr.service.SAPRDroni;
import it.uniroma2.saprClient.view.FlightPlan;
import it.uniroma2.saprClient.view.Pilot;
import java.net.MalformedURLException;
import java.net.URL;

public class ManageServiceImpl implements ManageService {
	String clazz = "MangeServiceImpl";
	final static Logger logger = Logger.getLogger("CLIENT");
	SAPRDroni service = null;
	public ManageServiceImpl(){
		String method = "ManageServiceImpl" ;
		URL urlService = null;
		try {
			urlService = new URL("http://188.166.44.110:8080/SAPR/SAPRService?wsdl");
		} catch (MalformedURLException e) {
			logger.info(String.format("Class:%s-Method:%s::Error url[%s]", clazz,method,e.toString()));
			e.printStackTrace();
		}
		service = FactoryServiceSAPR.getService(urlService);		
	}
	
	public Boolean addPilot(Pilot p) {
		String method = "addPilot";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		RequestPilot rq = new RequestPilot();
		rq.setOperation(Operation.ADD);
		buildMapPilot(p, rq);
		
		try {
			result = service.managerPilot(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			return false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}


	public Boolean removePilot(Pilot p) {
		String method = "removePilot";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		RequestPilot rq = new RequestPilot();
		rq.setOperation(Operation.DELETE);
		buildMapPilot(p, rq);
		
		try {
			result = service.managerPilot(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			result = false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}
	
	private void buildMapPilot(Pilot p, RequestPilot rq) {
		String method = "buildMapPilot";
		logger.info(String.format("Class:%s-Method:%s::START with dates", clazz,method));
		
		rq.setName(p.getName());
		rq.setSurname(p.getSurname());
		rq.setNation(p.getNation());
		rq.setState(p.getState());
		rq.setResidence(p.getResidence());
		rq.setMail(p.getMail());
		rq.setPhone(p.getPhone());
		rq.setTaxCode(p.getTaxcode());
		rq.setPassword(p.getPassword());
		rq.setBirthDate(p.getBirthdate());
		rq.setPilotLicense(p.getLicensepilot());
		
		logger.info(String.format("Class:%s-Method:%s::END", clazz,method));
	}
        
        public Boolean addFlightPlan(FlightPlan p) {
		String method = "addFlightPlan";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		RequestFlightPlan rq = new RequestFlightPlan();
		rq.setOperation(Operation.ADD);
		buildMapFlightPlan(p, rq);
		try {
			result = service.managerFlightPlan(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			return false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}


	public Boolean removeFlightPlan(FlightPlan p) {
		String method = "removeFlightPlan";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		RequestFlightPlan rq = new RequestFlightPlan();
		rq.setOperation(Operation.DELETE);
		buildMapFlightPlan(p, rq);
		
		try {
			result = service.managerFlightPlan(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			result = false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}
	
	private void buildMapFlightPlan(FlightPlan p, RequestFlightPlan rq) {
		String method = "buildMapFlightPlan";
		logger.info(String.format("Class:%s-Method:%s::START with dates", clazz,method));
		rq.setDestinations(p.getDestinations());
		rq.setDeparture(p.getDeparture());
		rq.setDateDeparture(p.getDateDeparture());
		rq.setTimeDeparture(p.getTimeDeparture());
		rq.setNowArriving(p.getNowArriving());
		rq.setIdSapr(p.getIdSapr());
		rq.setIdNote(p.getIdNote());
		//non esiste setDevice nella RequestFlightPlan rq.setDevices(p.getDevices());
		rq.setPilotLicense(p.getPilotLicense());	
		logger.info(String.format("Class:%s-Method:%s::END", clazz,method));
	}

}
