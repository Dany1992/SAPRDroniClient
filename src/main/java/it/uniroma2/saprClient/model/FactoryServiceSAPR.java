package it.uniroma2.saprClient.model;

import java.net.URL;

<<<<<<< HEAD
import it.uniroma2.sapr.service.SAPRDroniInterface;
=======
import it.uniroma2.sapr.service.SAPRDroni;
>>>>>>> origin/dindi-branch
import it.uniroma2.sapr.service.SAPRDroniService;

/**
 * Classe che si occupa di fornire l'interfaccia per comunicare con il servizio SAPR
 * 
 * @author Danilo Butrico
 *
 */
public class FactoryServiceSAPR {
	
	private static SAPRDroniInterface saprService = null;
	
	private FactoryServiceSAPR(){
		
	}
	
	public static synchronized SAPRDroniInterface getService(){
		
		if (saprService == null){
			SAPRDroniService sapr = new SAPRDroniService();
			saprService = sapr.getSAPRDroniPort();
		}
		return saprService;
	}
	
<<<<<<< HEAD
	public static synchronized SAPRDroniInterface getService(URL url){
=======
	public static synchronized SAPRDroni getService(URL url){
>>>>>>> origin/dindi-branch
		if (saprService == null){
			SAPRDroniService sapr = new SAPRDroniService(url);
			saprService = sapr.getSAPRDroniPort();
		}
		return saprService;
	}

}
