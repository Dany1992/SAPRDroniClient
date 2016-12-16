
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

    private final static QName _GetFlightPlanByFlightResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getFlightPlanByFlightResponse");
    private final static QName _ResponseDevice_QNAME = new QName("http://service.sapr.uniroma2.it/", "ResponseDevice");
    private final static QName _SelectSaprResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "selectSaprResponse");
    private final static QName _GetFlightPlanBySaprResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getFlightPlanBySaprResponse");
    private final static QName _GetSaprs_QNAME = new QName("http://service.sapr.uniroma2.it/", "getSaprs");
    private final static QName _ManagerFlightPlanResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerFlightPlanResponse");
    private final static QName _Response_QNAME = new QName("http://service.sapr.uniroma2.it/", "Response");
    private final static QName _GetDeviceResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getDeviceResponse");
    private final static QName _RequestManagerCheckElement_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerCheckElement");
    private final static QName _GetPilot_QNAME = new QName("http://service.sapr.uniroma2.it/", "getPilot");
    private final static QName _ManagerNoteResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerNoteResponse");
    private final static QName _GetDevicesOfPilot_QNAME = new QName("http://service.sapr.uniroma2.it/", "getDevicesOfPilot");
    private final static QName _SelectSapr_QNAME = new QName("http://service.sapr.uniroma2.it/", "selectSapr");
    private final static QName _GetDevices_QNAME = new QName("http://service.sapr.uniroma2.it/", "getDevices");
    private final static QName _ResponseListPilots_QNAME = new QName("http://service.sapr.uniroma2.it/", "ResponseListPilots");
    private final static QName _RequestManagerPilot_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerPilot");
    private final static QName _Exception_QNAME = new QName("http://service.sapr.uniroma2.it/", "Exception");
    private final static QName _ResponsePilot_QNAME = new QName("http://service.sapr.uniroma2.it/", "ResponsePilot");
    private final static QName _GetNote_QNAME = new QName("http://service.sapr.uniroma2.it/", "getNote");
    private final static QName _ManagerNote_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerNote");
    private final static QName _ManagerSAPR_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerSAPR");
    private final static QName _GetSaprsOfPilot_QNAME = new QName("http://service.sapr.uniroma2.it/", "getSaprsOfPilot");
    private final static QName _RequestManagerFlightPlan_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerFlightPlan");
    private final static QName _GetPilotResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getPilotResponse");
    private final static QName _GetFlightPlanBySapr_QNAME = new QName("http://service.sapr.uniroma2.it/", "getFlightPlanBySapr");
    private final static QName _ManagerPilotResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerPilotResponse");
    private final static QName _RequestManagerNote_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerNote");
    private final static QName _GetSaprsResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getSaprsResponse");
    private final static QName _ManagerPilot_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerPilot");
    private final static QName _GetFlightPlanByFlight_QNAME = new QName("http://service.sapr.uniroma2.it/", "getFlightPlanByFlight");
    private final static QName _GetPilotsResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getPilotsResponse");
    private final static QName _GetDevicesResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getDevicesResponse");
    private final static QName _ResponseCheckElement_QNAME = new QName("http://service.sapr.uniroma2.it/", "ResponseCheckElement");
    private final static QName _ManagerFlightPlan_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerFlightPlan");
    private final static QName _GetDevicesOfPilotResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getDevicesOfPilotResponse");
    private final static QName _ManagerDevice_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerDevice");
    private final static QName _ResponseSapr_QNAME = new QName("http://service.sapr.uniroma2.it/", "ResponseSapr");
    private final static QName _GetSaprsOfPilotResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getSaprsOfPilotResponse");
    private final static QName _GetNoteResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "getNoteResponse");
    private final static QName _GetPilots_QNAME = new QName("http://service.sapr.uniroma2.it/", "getPilots");
    private final static QName _RequestManagerDevice_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerDevice");
    private final static QName _ResponseFlightPlan_QNAME = new QName("http://service.sapr.uniroma2.it/", "ResponseFlightPlan");
    private final static QName _GetDevice_QNAME = new QName("http://service.sapr.uniroma2.it/", "getDevice");
    private final static QName _ManagerSAPRResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerSAPRResponse");
    private final static QName _RequestManagerSAPR_QNAME = new QName("http://service.sapr.uniroma2.it/", "RequestManagerSAPR");
    private final static QName _ManagerDeviceResponse_QNAME = new QName("http://service.sapr.uniroma2.it/", "managerDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.uniroma2.sapr.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNoteResponse }
     * 
     */
    public GetNoteResponse createGetNoteResponse() {
        return new GetNoteResponse();
    }

    /**
     * Create an instance of {@link GetPilots }
     * 
     */
    public GetPilots createGetPilots() {
        return new GetPilots();
    }

    /**
     * Create an instance of {@link ResponseSapr }
     * 
     */
    public ResponseSapr createResponseSapr() {
        return new ResponseSapr();
    }

    /**
     * Create an instance of {@link GetSaprsOfPilotResponse }
     * 
     */
    public GetSaprsOfPilotResponse createGetSaprsOfPilotResponse() {
        return new GetSaprsOfPilotResponse();
    }

    /**
     * Create an instance of {@link GetDevicesOfPilotResponse }
     * 
     */
    public GetDevicesOfPilotResponse createGetDevicesOfPilotResponse() {
        return new GetDevicesOfPilotResponse();
    }

    /**
     * Create an instance of {@link ManagerDevice }
     * 
     */
    public ManagerDevice createManagerDevice() {
        return new ManagerDevice();
    }

    /**
     * Create an instance of {@link ResponseCheckElement }
     * 
     */
    public ResponseCheckElement createResponseCheckElement() {
        return new ResponseCheckElement();
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
     * Create an instance of {@link RequestDevice }
     * 
     */
    public RequestDevice createRequestDevice() {
        return new RequestDevice();
    }

    /**
     * Create an instance of {@link ResponseFlightPlan }
     * 
     */
    public ResponseFlightPlan createResponseFlightPlan() {
        return new ResponseFlightPlan();
    }

    /**
     * Create an instance of {@link GetDevice }
     * 
     */
    public GetDevice createGetDevice() {
        return new GetDevice();
    }

    /**
     * Create an instance of {@link ManagerSAPRResponse }
     * 
     */
    public ManagerSAPRResponse createManagerSAPRResponse() {
        return new ManagerSAPRResponse();
    }

    /**
     * Create an instance of {@link GetFlightPlanBySapr }
     * 
     */
    public GetFlightPlanBySapr createGetFlightPlanBySapr() {
        return new GetFlightPlanBySapr();
    }

    /**
     * Create an instance of {@link ManagerPilotResponse }
     * 
     */
    public ManagerPilotResponse createManagerPilotResponse() {
        return new ManagerPilotResponse();
    }

    /**
     * Create an instance of {@link GetSaprsResponse }
     * 
     */
    public GetSaprsResponse createGetSaprsResponse() {
        return new GetSaprsResponse();
    }

    /**
     * Create an instance of {@link RequestFlightPlan }
     * 
     */
    public RequestFlightPlan createRequestFlightPlan() {
        return new RequestFlightPlan();
    }

    /**
     * Create an instance of {@link GetPilotResponse }
     * 
     */
    public GetPilotResponse createGetPilotResponse() {
        return new GetPilotResponse();
    }

    /**
     * Create an instance of {@link GetDevicesResponse }
     * 
     */
    public GetDevicesResponse createGetDevicesResponse() {
        return new GetDevicesResponse();
    }

    /**
     * Create an instance of {@link ManagerPilot }
     * 
     */
    public ManagerPilot createManagerPilot() {
        return new ManagerPilot();
    }

    /**
     * Create an instance of {@link GetFlightPlanByFlight }
     * 
     */
    public GetFlightPlanByFlight createGetFlightPlanByFlight() {
        return new GetFlightPlanByFlight();
    }

    /**
     * Create an instance of {@link GetPilotsResponse }
     * 
     */
    public GetPilotsResponse createGetPilotsResponse() {
        return new GetPilotsResponse();
    }

    /**
     * Create an instance of {@link ResponseListPilots }
     * 
     */
    public ResponseListPilots createResponseListPilots() {
        return new ResponseListPilots();
    }

    /**
     * Create an instance of {@link RequestPilot }
     * 
     */
    public RequestPilot createRequestPilot() {
        return new RequestPilot();
    }

    /**
     * Create an instance of {@link GetDevices }
     * 
     */
    public GetDevices createGetDevices() {
        return new GetDevices();
    }

    /**
     * Create an instance of {@link GetDevicesOfPilot }
     * 
     */
    public GetDevicesOfPilot createGetDevicesOfPilot() {
        return new GetDevicesOfPilot();
    }

    /**
     * Create an instance of {@link SelectSapr }
     * 
     */
    public SelectSapr createSelectSapr() {
        return new SelectSapr();
    }

    /**
     * Create an instance of {@link GetSaprsOfPilot }
     * 
     */
    public GetSaprsOfPilot createGetSaprsOfPilot() {
        return new GetSaprsOfPilot();
    }

    /**
     * Create an instance of {@link GetNote }
     * 
     */
    public GetNote createGetNote() {
        return new GetNote();
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
     * Create an instance of {@link ResponsePilot }
     * 
     */
    public ResponsePilot createResponsePilot() {
        return new ResponsePilot();
    }

    /**
     * Create an instance of {@link GetFlightPlanBySaprResponse }
     * 
     */
    public GetFlightPlanBySaprResponse createGetFlightPlanBySaprResponse() {
        return new GetFlightPlanBySaprResponse();
    }

    /**
     * Create an instance of {@link GetSaprs }
     * 
     */
    public GetSaprs createGetSaprs() {
        return new GetSaprs();
    }

    /**
     * Create an instance of {@link ManagerFlightPlanResponse }
     * 
     */
    public ManagerFlightPlanResponse createManagerFlightPlanResponse() {
        return new ManagerFlightPlanResponse();
    }

    /**
     * Create an instance of {@link ResponseDevice }
     * 
     */
    public ResponseDevice createResponseDevice() {
        return new ResponseDevice();
    }

    /**
     * Create an instance of {@link SelectSaprResponse }
     * 
     */
    public SelectSaprResponse createSelectSaprResponse() {
        return new SelectSaprResponse();
    }

    /**
     * Create an instance of {@link GetFlightPlanByFlightResponse }
     * 
     */
    public GetFlightPlanByFlightResponse createGetFlightPlanByFlightResponse() {
        return new GetFlightPlanByFlightResponse();
    }

    /**
     * Create an instance of {@link ManagerNoteResponse }
     * 
     */
    public ManagerNoteResponse createManagerNoteResponse() {
        return new ManagerNoteResponse();
    }

    /**
     * Create an instance of {@link GetPilot }
     * 
     */
    public GetPilot createGetPilot() {
        return new GetPilot();
    }

    /**
     * Create an instance of {@link RequestCheckElement }
     * 
     */
    public RequestCheckElement createRequestCheckElement() {
        return new RequestCheckElement();
    }

    /**
     * Create an instance of {@link GetDeviceResponse }
     * 
     */
    public GetDeviceResponse createGetDeviceResponse() {
        return new GetDeviceResponse();
    }

    /**
     * Create an instance of {@link CheckElement }
     * 
     */
    public CheckElement createCheckElement() {
        return new CheckElement();
    }

    /**
     * Create an instance of {@link ResponseNote }
     * 
     */
    public ResponseNote createResponseNote() {
        return new ResponseNote();
    }

    /**
     * Create an instance of {@link RequestNote }
     * 
     */
    public RequestNote createRequestNote() {
        return new RequestNote();
    }

    /**
     * Create an instance of {@link Device }
     * 
     */
    public Device createDevice() {
        return new Device();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightPlanByFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getFlightPlanByFlightResponse")
    public JAXBElement<GetFlightPlanByFlightResponse> createGetFlightPlanByFlightResponse(GetFlightPlanByFlightResponse value) {
        return new JAXBElement<GetFlightPlanByFlightResponse>(_GetFlightPlanByFlightResponse_QNAME, GetFlightPlanByFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "ResponseDevice")
    public JAXBElement<ResponseDevice> createResponseDevice(ResponseDevice value) {
        return new JAXBElement<ResponseDevice>(_ResponseDevice_QNAME, ResponseDevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectSaprResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "selectSaprResponse")
    public JAXBElement<SelectSaprResponse> createSelectSaprResponse(SelectSaprResponse value) {
        return new JAXBElement<SelectSaprResponse>(_SelectSaprResponse_QNAME, SelectSaprResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightPlanBySaprResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getFlightPlanBySaprResponse")
    public JAXBElement<GetFlightPlanBySaprResponse> createGetFlightPlanBySaprResponse(GetFlightPlanBySaprResponse value) {
        return new JAXBElement<GetFlightPlanBySaprResponse>(_GetFlightPlanBySaprResponse_QNAME, GetFlightPlanBySaprResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaprs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getSaprs")
    public JAXBElement<GetSaprs> createGetSaprs(GetSaprs value) {
        return new JAXBElement<GetSaprs>(_GetSaprs_QNAME, GetSaprs.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getDeviceResponse")
    public JAXBElement<GetDeviceResponse> createGetDeviceResponse(GetDeviceResponse value) {
        return new JAXBElement<GetDeviceResponse>(_GetDeviceResponse_QNAME, GetDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestCheckElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "RequestManagerCheckElement")
    public JAXBElement<RequestCheckElement> createRequestManagerCheckElement(RequestCheckElement value) {
        return new JAXBElement<RequestCheckElement>(_RequestManagerCheckElement_QNAME, RequestCheckElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPilot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getPilot")
    public JAXBElement<GetPilot> createGetPilot(GetPilot value) {
        return new JAXBElement<GetPilot>(_GetPilot_QNAME, GetPilot.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesOfPilot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getDevicesOfPilot")
    public JAXBElement<GetDevicesOfPilot> createGetDevicesOfPilot(GetDevicesOfPilot value) {
        return new JAXBElement<GetDevicesOfPilot>(_GetDevicesOfPilot_QNAME, GetDevicesOfPilot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectSapr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "selectSapr")
    public JAXBElement<SelectSapr> createSelectSapr(SelectSapr value) {
        return new JAXBElement<SelectSapr>(_SelectSapr_QNAME, SelectSapr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getDevices")
    public JAXBElement<GetDevices> createGetDevices(GetDevices value) {
        return new JAXBElement<GetDevices>(_GetDevices_QNAME, GetDevices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseListPilots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "ResponseListPilots")
    public JAXBElement<ResponseListPilots> createResponseListPilots(ResponseListPilots value) {
        return new JAXBElement<ResponseListPilots>(_ResponseListPilots_QNAME, ResponseListPilots.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePilot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "ResponsePilot")
    public JAXBElement<ResponsePilot> createResponsePilot(ResponsePilot value) {
        return new JAXBElement<ResponsePilot>(_ResponsePilot_QNAME, ResponsePilot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getNote")
    public JAXBElement<GetNote> createGetNote(GetNote value) {
        return new JAXBElement<GetNote>(_GetNote_QNAME, GetNote.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaprsOfPilot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getSaprsOfPilot")
    public JAXBElement<GetSaprsOfPilot> createGetSaprsOfPilot(GetSaprsOfPilot value) {
        return new JAXBElement<GetSaprsOfPilot>(_GetSaprsOfPilot_QNAME, GetSaprsOfPilot.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPilotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getPilotResponse")
    public JAXBElement<GetPilotResponse> createGetPilotResponse(GetPilotResponse value) {
        return new JAXBElement<GetPilotResponse>(_GetPilotResponse_QNAME, GetPilotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightPlanBySapr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getFlightPlanBySapr")
    public JAXBElement<GetFlightPlanBySapr> createGetFlightPlanBySapr(GetFlightPlanBySapr value) {
        return new JAXBElement<GetFlightPlanBySapr>(_GetFlightPlanBySapr_QNAME, GetFlightPlanBySapr.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "RequestManagerNote")
    public JAXBElement<Object> createRequestManagerNote(Object value) {
        return new JAXBElement<Object>(_RequestManagerNote_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaprsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getSaprsResponse")
    public JAXBElement<GetSaprsResponse> createGetSaprsResponse(GetSaprsResponse value) {
        return new JAXBElement<GetSaprsResponse>(_GetSaprsResponse_QNAME, GetSaprsResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightPlanByFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getFlightPlanByFlight")
    public JAXBElement<GetFlightPlanByFlight> createGetFlightPlanByFlight(GetFlightPlanByFlight value) {
        return new JAXBElement<GetFlightPlanByFlight>(_GetFlightPlanByFlight_QNAME, GetFlightPlanByFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPilotsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getPilotsResponse")
    public JAXBElement<GetPilotsResponse> createGetPilotsResponse(GetPilotsResponse value) {
        return new JAXBElement<GetPilotsResponse>(_GetPilotsResponse_QNAME, GetPilotsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getDevicesResponse")
    public JAXBElement<GetDevicesResponse> createGetDevicesResponse(GetDevicesResponse value) {
        return new JAXBElement<GetDevicesResponse>(_GetDevicesResponse_QNAME, GetDevicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseCheckElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "ResponseCheckElement")
    public JAXBElement<ResponseCheckElement> createResponseCheckElement(ResponseCheckElement value) {
        return new JAXBElement<ResponseCheckElement>(_ResponseCheckElement_QNAME, ResponseCheckElement.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesOfPilotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getDevicesOfPilotResponse")
    public JAXBElement<GetDevicesOfPilotResponse> createGetDevicesOfPilotResponse(GetDevicesOfPilotResponse value) {
        return new JAXBElement<GetDevicesOfPilotResponse>(_GetDevicesOfPilotResponse_QNAME, GetDevicesOfPilotResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseSapr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "ResponseSapr")
    public JAXBElement<ResponseSapr> createResponseSapr(ResponseSapr value) {
        return new JAXBElement<ResponseSapr>(_ResponseSapr_QNAME, ResponseSapr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaprsOfPilotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getSaprsOfPilotResponse")
    public JAXBElement<GetSaprsOfPilotResponse> createGetSaprsOfPilotResponse(GetSaprsOfPilotResponse value) {
        return new JAXBElement<GetSaprsOfPilotResponse>(_GetSaprsOfPilotResponse_QNAME, GetSaprsOfPilotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getNoteResponse")
    public JAXBElement<GetNoteResponse> createGetNoteResponse(GetNoteResponse value) {
        return new JAXBElement<GetNoteResponse>(_GetNoteResponse_QNAME, GetNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPilots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getPilots")
    public JAXBElement<GetPilots> createGetPilots(GetPilots value) {
        return new JAXBElement<GetPilots>(_GetPilots_QNAME, GetPilots.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseFlightPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "ResponseFlightPlan")
    public JAXBElement<ResponseFlightPlan> createResponseFlightPlan(ResponseFlightPlan value) {
        return new JAXBElement<ResponseFlightPlan>(_ResponseFlightPlan_QNAME, ResponseFlightPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "getDevice")
    public JAXBElement<GetDevice> createGetDevice(GetDevice value) {
        return new JAXBElement<GetDevice>(_GetDevice_QNAME, GetDevice.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagerDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sapr.uniroma2.it/", name = "managerDeviceResponse")
    public JAXBElement<ManagerDeviceResponse> createManagerDeviceResponse(ManagerDeviceResponse value) {
        return new JAXBElement<ManagerDeviceResponse>(_ManagerDeviceResponse_QNAME, ManagerDeviceResponse.class, null, value);
    }

}
