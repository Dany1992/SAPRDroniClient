package it.uniroma2.saprClient.model;

import it.uniroma2.sapr.service.ResponseDevice;
import it.uniroma2.saprClient.view.Pilot;
import it.uniroma2.saprClient.view.Device;
import java.util.List;

public interface ManageService {
	public Boolean addPilot(Pilot p);
	public Boolean removePilot(Pilot p);
        public Boolean addDevice(Device d);
        public Boolean removeDevice(Device d);
        public List<ResponseDevice> selectDevices(String p);
}
