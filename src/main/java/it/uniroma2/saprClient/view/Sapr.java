package it.uniroma2.saprClient.view;

import java.util.ArrayList;

public class Sapr {
	protected int idSapr;
	protected String model;
	protected String producer;
	protected int weight;
	protected int heavyweight;
	protected String battery;
	protected int maxDistance;
	protected int maxHeight;
	protected String pilotLicense;
    protected ArrayList<String> checkSapr;
    protected int active;

    public int getIdSapr() {
        return idSapr;
    }

    public void setIdSapr(int idSapr) {
        this.idSapr = idSapr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeavyweight() {
        return heavyweight;
    }

    public void setHeavyweight(int heavyweight) {
        this.heavyweight = heavyweight;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getPilotLicense() {
        return pilotLicense;
    }

    public void setPilotLicense(String pilotLicense) {
        this.pilotLicense = pilotLicense;
    }

    public ArrayList<String> getCheckSapr() {
        return checkSapr;
    }

    public void setCheckSapr(ArrayList<String> checkSapr) {
        this.checkSapr = checkSapr;
    }

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Sapr [idSapr=" + idSapr + ", model=" + model + ", producer=" + producer + ", weight=" + weight
				+ ", heavyweight=" + heavyweight + ", battery=" + battery + ", maxDistance=" + maxDistance
				+ ", maxHeight=" + maxHeight + ", pilotLicense=" + pilotLicense + ", checkSapr=" + checkSapr
				+ ", active=" + active + "]";
	}
	
}

