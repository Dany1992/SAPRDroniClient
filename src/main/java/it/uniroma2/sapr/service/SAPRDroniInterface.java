
package it.uniroma2.sapr.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SAPRDroniInterface", targetNamespace = "http://service.sapr.uniroma2.it/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SAPRDroniInterface {


    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "managerPilot", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerPilot")
    @ResponseWrapper(localName = "managerPilotResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerPilotResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerPilotRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerPilotResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerPilot/Fault/Exception")
    })
    public Boolean managerPilot(
        @WebParam(name = "request", targetNamespace = "")
        RequestPilot request)
        throws Exception_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "managerSAPR", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerSAPR")
    @ResponseWrapper(localName = "managerSAPRResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerSAPRResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerSAPRRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerSAPRResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerSAPR/Fault/Exception")
    })
    public Boolean managerSAPR(
        @WebParam(name = "request", targetNamespace = "")
        RequestSAPR request)
        throws Exception_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "managerDevice", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerDevice")
    @ResponseWrapper(localName = "managerDeviceResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerDeviceResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerDeviceRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerDeviceResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerDevice/Fault/Exception")
    })
    public Boolean managerDevice(
        @WebParam(name = "request", targetNamespace = "")
        RequestDevice request)
        throws Exception_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "managerNote", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerNote")
    @ResponseWrapper(localName = "managerNoteResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerNoteResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerNoteRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerNoteResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerNote/Fault/Exception")
    })
    public Boolean managerNote(
        @WebParam(name = "request", targetNamespace = "")
        RequestNote request)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns it.uniroma2.sapr.service.ResponseListPilots
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPilots", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetPilots")
    @ResponseWrapper(localName = "getPilotsResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetPilotsResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getPilotsRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getPilotsResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getPilots/Fault/Exception")
    })
    public ResponseListPilots getPilots()
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.uniroma2.sapr.service.ResponseNote
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNote", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetNote")
    @ResponseWrapper(localName = "getNoteResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetNoteResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getNoteRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getNoteResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getNote/Fault/Exception")
    })
    public ResponseNote getNote(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<it.uniroma2.sapr.service.ResponseSapr>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSaprsOfPilot", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetSaprsOfPilot")
    @ResponseWrapper(localName = "getSaprsOfPilotResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetSaprsOfPilotResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getSaprsOfPilotRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getSaprsOfPilotResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getSaprsOfPilot/Fault/Exception")
    })
    public List<ResponseSapr> getSaprsOfPilot(
        @WebParam(name = "arg0", targetNamespace = "")
        Opzione arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.uniroma2.sapr.service.ResponseSapr
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectSapr", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.SelectSapr")
    @ResponseWrapper(localName = "selectSaprResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.SelectSaprResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/selectSaprRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/selectSaprResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/selectSapr/Fault/Exception")
    })
    public ResponseSapr selectSapr(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.uniroma2.sapr.service.ResponseDevice
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDevice", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetDevice")
    @ResponseWrapper(localName = "getDeviceResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetDeviceResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getDeviceRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getDeviceResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getDevice/Fault/Exception")
    })
    public ResponseDevice getDevice(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<it.uniroma2.sapr.service.ResponseDevice>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDevicesOfPilot", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetDevicesOfPilot")
    @ResponseWrapper(localName = "getDevicesOfPilotResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetDevicesOfPilotResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getDevicesOfPilotRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getDevicesOfPilotResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getDevicesOfPilot/Fault/Exception")
    })
    public List<ResponseDevice> getDevicesOfPilot(
        @WebParam(name = "arg0", targetNamespace = "")
        Opzione arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "managerFlightPlan", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerFlightPlan")
    @ResponseWrapper(localName = "managerFlightPlanResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.ManagerFlightPlanResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerFlightPlanRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerFlightPlanResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/managerFlightPlan/Fault/Exception")
    })
    public Boolean managerFlightPlan(
        @WebParam(name = "request", targetNamespace = "")
        RequestFlightPlan request)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.uniroma2.sapr.service.ResponseDevice
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDevices", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetDevices")
    @ResponseWrapper(localName = "getDevicesResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetDevicesResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getDevicesRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getDevicesResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getDevices/Fault/Exception")
    })
    public ResponseDevice getDevices(
        @WebParam(name = "arg0", targetNamespace = "")
        Opzione arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns it.uniroma2.sapr.service.ResponseFlightPlan
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFlightPlanByFlight", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetFlightPlanByFlight")
    @ResponseWrapper(localName = "getFlightPlanByFlightResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetFlightPlanByFlightResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getFlightPlanByFlightRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getFlightPlanByFlightResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getFlightPlanByFlight/Fault/Exception")
    })
    public ResponseFlightPlan getFlightPlanByFlight(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<it.uniroma2.sapr.service.ResponseFlightPlan>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFlightPlanBySapr", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetFlightPlanBySapr")
    @ResponseWrapper(localName = "getFlightPlanBySaprResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetFlightPlanBySaprResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getFlightPlanBySaprRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getFlightPlanBySaprResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getFlightPlanBySapr/Fault/Exception")
    })
    public List<ResponseFlightPlan> getFlightPlanBySapr(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.uniroma2.sapr.service.ResponsePilot
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPilot", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetPilot")
    @ResponseWrapper(localName = "getPilotResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetPilotResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getPilotRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getPilotResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getPilot/Fault/Exception")
    })
    public ResponsePilot getPilot(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<it.uniroma2.sapr.service.ResponseSapr>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSaprs", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetSaprs")
    @ResponseWrapper(localName = "getSaprsResponse", targetNamespace = "http://service.sapr.uniroma2.it/", className = "it.uniroma2.sapr.service.GetSaprsResponse")
    @Action(input = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getSaprsRequest", output = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getSaprsResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.sapr.uniroma2.it/SAPRDroniInterface/getSaprs/Fault/Exception")
    })
    public List<ResponseSapr> getSaprs(
        @WebParam(name = "arg0", targetNamespace = "")
        Opzione arg0)
        throws Exception_Exception
    ;

}