package it.uniroma2.saprClient.model;

import java.net.URL;

import it.uniroma2.sapr.service.SAPRDroni;
import it.uniroma2.sapr.service.SAPRDroniService;

/**
 * Classe che si occupa di fornire l'interfaccia per comunicare con il servizio SAPR
 * 
 * @author Danilo Butrico
 *
 */
public class FactoryServiceSAPR {
	
	private static SAPRDroni saprService = null;
	
	private FactoryServiceSAPR(){
		
	}
	
	public static synchronized SAPRDroni getService(){
		
		if (saprService == null){
			SAPRDroniService sapr = new SAPRDroniService();
			saprService = sapr.getSAPRDroniPort();
		}
		return saprService;
	}
	
	public static synchronized SAPRDroni getService(URL url){
		if (saprService == null){
			SAPRDroniService sapr = new SAPRDroniService(url);
			saprService = sapr.getSAPRDroniPort();
		}
		return saprService;
	}

}
