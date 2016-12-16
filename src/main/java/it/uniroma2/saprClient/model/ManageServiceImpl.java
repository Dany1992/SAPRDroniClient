package it.uniroma2.saprClient.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import it.uniroma2.sapr.service.Exception_Exception;
import it.uniroma2.sapr.service.Operation;
import it.uniroma2.sapr.service.RequestPilot;
<<<<<<< HEAD
import it.uniroma2.sapr.service.RequestDevice;
import it.uniroma2.sapr.service.SAPRDroni;
=======
import it.uniroma2.sapr.service.SAPRDroniInterface;
>>>>>>> master
import it.uniroma2.saprClient.view.Pilot;
import it.uniroma2.saprClient.view.Device;
import it.uniroma2.saprClient.view.CheckElement;

public class ManageServiceImpl implements ManageService {
	String clazz = "MangeServiceImpl";
	final static Logger logger = Logger.getLogger("CLIENT");
	SAPRDroniInterface service = null;
	
	public ManageServiceImpl(){
		String method = "ManageServiceImpl" ;
		URL urlService = null;
		try {
			urlService = new URL("http://localhost:9999/ws/sapr?wsdl");
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
		rq.setPilotLicense(p.getLicensepilot());
		
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
	
	public Boolean addDevice(Device d) {
		String method = "addDevice";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,d.toString()));
		RequestDevice rq = new RequestDevice();
		rq.setOperation(Operation.ADD);
		buildMapDevice(d, rq);
		
		try {
			result = service.managerDevice(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			return false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}


	public Boolean removeDevice(Device p) {
		String method = "removeDevice";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		RequestDevice rq = new RequestDevice();
		rq.setOperation(Operation.DELETE);
		buildMapDevice(p, rq);
		
		try {
			result = service.managerDevice(rq);
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

        private void buildMapDevice(Device d, RequestDevice rq) {
                String method = "buildMapDevice";
		logger.info(String.format("Class:%s-Method:%s::START with dates", clazz,method));
		rq.setIdDevice(d.getIdDevice());
                rq.setModel(d.getModel());
                rq.setTyper(d.getType());
                rq.setWeight(d.getWeight());
                rq.setProducer(d.getProducer());
                rq.setPilotLicense(d.getPilotLicense());
                // MANCA checkDevice

		logger.info(String.format("Class:%s-Method:%s::END", clazz,method));
        }

}
