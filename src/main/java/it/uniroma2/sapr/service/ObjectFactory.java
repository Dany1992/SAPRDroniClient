
package it.uniroma2.sapr.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.uniroma2.sapr.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestManagerFlightPlan_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerFlightPlan");
    private final static QName _ManagerFlightPlanResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerFlightPlanResponse");
    private final static QName _ManagerPilotResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerPilotResponse");
    private final static QName _RequestManagerNote_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerNote");
    private final static QName _ManagerPilot_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerPilot");
    private final static QName _ManagerNoteResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerNoteResponse");
    private final static QName _ManagerFlightPlan_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerFlightPlan");
    private final static QName _ManagerDevice_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerDevice");
    private final static QName _RequestManagerPilot_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerPilot");
    private final static QName _Exception_QNAME = new QName("http://service.sapr.uniroma2.it/", "Exception");
    private final static QName _RequestManagerDevice_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerDevice");
    private final static QName _ManagerSAPRResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerSAPRResponse");
    private final static QName _RequestManagerSAPR_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerSAPR");
    private final static QName _ManagerNote_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerNote");
    private final static QName _ManagerSAPR_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerSAPR");
    private final static QName _ManagerDeviceResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.uniroma2.sapr.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestPilot }
     * 
     */
    public RequestPilot createRequestPilot() {
        return new RequestPilot();
    }

    /**
     * Create an instance of {@link ManagerDevice }
     * 
     */
    public ManagerDevice createManagerDevice() {
        return new ManagerDevice();
    }

    /**
     * Create an instance of {@link ManagerFlightPlan }
     * 
     */
    public ManagerFlightPlan createManagerFlightPlan() {
        return new ManagerFlightPlan();
    }

    /**
     * Create an instance of {@link ManagerDeviceResponse }
     * 
     */
    public ManagerDeviceResponse createManagerDeviceResponse() {
        return new ManagerDeviceResponse();
    }

    /**
     * Create an instance of {@link RequestSAPR }
     * 
     */
    public RequestSAPR createRequestSAPR() {
        return new RequestSAPR();
    }

    /**
     * Create an instance of {@link ManagerNote }
     * 
     */
    public ManagerNote createManagerNote() {
        return new ManagerNote();
    }

    /**
     * Create an instance of {@link ManagerSAPR }
     * 
     */
    public ManagerSAPR createManagerSAPR() {
        return new ManagerSAPR();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link RequestDevice }
     * 
     */
    public RequestDevice createRequestDevice() {
        return new RequestDevice();
    }

    /**
     * Create an instance of {@link ManagerSAPRResponse }
     * 
     */
    public ManagerSAPRResponse createManagerSAPRResponse() {
        return new ManagerSAPRResponse();
    }

    /**
     * Create an instance of {@link ManagerFlightPlanResponse }
     * 
     */
    public ManagerFlightPlanResponse createManagerFlightPlanResponse() {
        return new ManagerFlightPlanResponse();
    }

    /**
     * Create an instance of {@link ManagerPilotResponse }
     * 
     */
    public ManagerPilotResponse createManagerPilotResponse() {
        return new ManagerPilotResponse();
    }

    /**
     * Create an instance of {@link RequestNote }
     * 
     */
    public RequestNote createRequestNote() {
        return new RequestNote();
    }

    /**
     * Create an instance of {@link RequestFlightPlan }
     * 
     */
    public RequestFlightPlan createRequestFlightPlan() {
        return new RequestFlightPlan();
    }

    /**
     * Create an instance of {@link ManagerNoteResponse }
     * 
     */
    public ManagerNoteResponse createManagerNoteResponse() {
        return new ManagerNoteResponse();
    }

    /**
     * Create an instance of {@link ManagerPilot }
     * 
     */
    public ManagerPilot createManagerPilot() {
        return new ManagerPilot();
    }

    /**
     * Create an instance of {@link CheckElement }
     * 
     */
    public CheckElement createCheckElement() {
        return new CheckElement();
    }

    /**
     * Create an instance of {@link Device }
     * 
     */
    public Device createDevice() {
        return new Device();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestFlightPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "RequestManagerFlightPlan")
    public JAXBElement<RequestFlightPlan> createRequestManagerFlightPlan(RequestFlightPlan value) {
        return new JAXBElement<RequestFlightPlan>(_RequestManagerFlightPlan_QNAME, RequestFlightPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerFlightPlanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerFlightPlanResponse")
    public JAXBElement<ManagerFlightPlanResponse> createManagerFlightPlanResponse(ManagerFlightPlanResponse value) {
        return new JAXBElement<ManagerFlightPlanResponse>(_ManagerFlightPlanResponse_QNAME, ManagerFlightPlanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerPilotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerPilotResponse")
    public JAXBElement<ManagerPilotResponse> createManagerPilotResponse(ManagerPilotResponse value) {
        return new JAXBElement<ManagerPilotResponse>(_ManagerPilotResponse_QNAME, ManagerPilotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "RequestManagerNote")
    public JAXBElement<RequestNote> createRequestManagerNote(RequestNote value) {
        return new JAXBElement<RequestNote>(_RequestManagerNote_QNAME, RequestNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerPilot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerPilot")
    public JAXBElement<ManagerPilot> createManagerPilot(ManagerPilot value) {
        return new JAXBElement<ManagerPilot>(_ManagerPilot_QNAME, ManagerPilot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerNoteResponse")
    public JAXBElement<ManagerNoteResponse> createManagerNoteResponse(ManagerNoteResponse value) {
        return new JAXBElement<ManagerNoteResponse>(_ManagerNoteResponse_QNAME, ManagerNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerFlightPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerFlightPlan")
    public JAXBElement<ManagerFlightPlan> createManagerFlightPlan(ManagerFlightPlan value) {
        return new JAXBElement<ManagerFlightPlan>(_ManagerFlightPlan_QNAME, ManagerFlightPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerDevice")
    public JAXBElement<ManagerDevice> createManagerDevice(ManagerDevice value) {
        return new JAXBElement<ManagerDevice>(_ManagerDevice_QNAME, ManagerDevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestPilot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "RequestManagerPilot")
    public JAXBElement<RequestPilot> createRequestManagerPilot(RequestPilot value) {
        return new JAXBElement<RequestPilot>(_RequestManagerPilot_QNAME, RequestPilot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "RequestManagerDevice")
    public JAXBElement<RequestDevice> createRequestManagerDevice(RequestDevice value) {
        return new JAXBElement<RequestDevice>(_RequestManagerDevice_QNAME, RequestDevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerSAPRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerSAPRResponse")
    public JAXBElement<ManagerSAPRResponse> createManagerSAPRResponse(ManagerSAPRResponse value) {
        return new JAXBElement<ManagerSAPRResponse>(_ManagerSAPRResponse_QNAME, ManagerSAPRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSAPR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "RequestManagerSAPR")
    public JAXBElement<RequestSAPR> createRequestManagerSAPR(RequestSAPR value) {
        return new JAXBElement<RequestSAPR>(_RequestManagerSAPR_QNAME, RequestSAPR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerNote")
    public JAXBElement<ManagerNote> createManagerNote(ManagerNote value) {
        return new JAXBElement<ManagerNote>(_ManagerNote_QNAME, ManagerNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerSAPR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerSAPR")
    public JAXBElement<ManagerSAPR> createManagerSAPR(ManagerSAPR value) {
        return new JAXBElement<ManagerSAPR>(_ManagerSAPR_QNAME, ManagerSAPR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerDeviceResponse")
    public JAXBElement<ManagerDeviceResponse> createManagerDeviceResponse(ManagerDeviceResponse value) {
        return new JAXBElement<ManagerDeviceResponse>(_ManagerDeviceResponse_QNAME, ManagerDeviceResponse.class, null, value);
    }

}
