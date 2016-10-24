package it.uniroma2.saprClient.model;

import it.uniroma2.saprClient.view.Pilot;
import it.uniroma2.saprClient.view.Device;

public interface ManageService {
	public Boolean addPilot(Pilot p);
	public Boolean removePilot(Pilot p);
        public Boolean addDevice(Device d);
        public Boolean removeDevice(Device d);
}
