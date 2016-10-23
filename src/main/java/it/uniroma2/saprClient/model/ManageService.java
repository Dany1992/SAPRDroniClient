package it.uniroma2.saprClient.model;

import it.uniroma2.sapr.view.Pilot;

public interface ManageService {
	public Boolean addPilot(Pilot p);
	public Boolean removePilot(Pilot p);
}
