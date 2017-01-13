package it.uniroma2.saprClient.view;
import java.util.ArrayList;

/**
 *
 * @author dario
 */
public class Device {
    protected int idDevice;
    protected String model;
    protected String type;
    protected int weight;
    protected String producer;
    protected String pilotLicense;
    protected ArrayList<String> checkDevice;

    public int getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(int idDevice) {
        this.idDevice = idDevice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getPilotLicense() {
        return pilotLicense;
    }

    public void setPilotLicense(String pilotLicense) {
        this.pilotLicense = pilotLicense;
    }

    public ArrayList<String> getCheckDevice() {
        return checkDevice;
    }

    public void setCheckDevice(ArrayList<String> checkDevice) {
        this.checkDevice = checkDevice;
    }

}
