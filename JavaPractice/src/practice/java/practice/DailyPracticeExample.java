package practice.java.practice;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author apobits@gmail.com
 */

public class DailyPracticeExample {

    public static void main(String[] args) throws IOException, JAXBException {

	CEMMissiontoAPIGEE request = new CEMMissiontoAPIGEE();
	request.setAction(
			"&lt;Headers&gt;&lt;Header name=&quot;Accept&quot;&gt;*/*&lt;/Header&gt;&lt;Header name=&quot;Accept-Encoding&quot;&gt;gzip,deflate&lt;/Header&gt;&lt;Header name=&quot;Authorization&quot;&gt;Basic eGVBbFh6NEhEbENlWjZOOWQ3ZEV6WFNYMEVKNzBwUG06YkFSY1RoQkdWNExHODRvZw==&lt;/Header&gt;&lt;/Headers&gt;");
	request.setCreatedBy("NETWORK SERVICE");
	request.setDestination("APIGee");
	CEMMissiontoAPIGEE.Mission mission = new CEMMissiontoAPIGEE.Mission();
	request.setMission(mission);
	mission.setCustomerPhoneNumber("");
	mission.setHTMLBody(
			"Notificación de Visita Técnica TIGO @@Buen dia . Se ha creado una orden de trabajo para INSTALACION de servicios. Pronto recibiras la notificación de la fecha de visita.");
	mission.setMissionID("");
	CEMMissiontoAPIGEE.Mission.MissionType type = new CEMMissiontoAPIGEE.Mission.MissionType();
	type.setName("Notification");
	mission.setMissionType(type);
	mission.setMissionURL("");
	mission.setSendByEmail(false);
	mission.setSendBySMS(false);
	mission.setSMSText("");
	CEMMissiontoAPIGEE.Mission.Task task = new CEMMissiontoAPIGEE.Mission.Task();
	mission.setTask(task);
	task.setAppointmentFinish("");
	task.setAppointmentStart("");
	CEMMissiontoAPIGEE.Mission.Task.Area area = new CEMMissiontoAPIGEE.Mission.Task.Area();
	area.setName("Guatemala");
	task.setArea(area);
	task.setAssignedEngineerName("");
	task.setCallID("GTM-0005347504");
	task.setCustomer("");
	CEMMissiontoAPIGEE.Mission.Task.District district = new CEMMissiontoAPIGEE.Mission.Task.District();
	district.setName("LA GOMERA LTE");
	task.setDuration(3600);
	task.setMCBillingAccountInfo("7 AV LOTE 17 COLONIA SANTA CATALINA LA GOMERA,ESCUINTLA");
	task.setMCCustomerCode("-1056867");
	task.setMCWorkPackageDescription("979,INTERNET WTTX 10 MEGAS,65766143,58700049");
	task.setNumber(1);
	CEMMissiontoAPIGEE.Mission.Task.Region region = new CEMMissiontoAPIGEE.Mission.Task.Region();
	region.setName("ESCUINTLA GT");
	task.setRegion(region);
	CEMMissiontoAPIGEE.Mission.Task.Status status = new CEMMissiontoAPIGEE.Mission.Task.Status();
	status.setKey(124135424);
	status.setName("Abierto");
	task.setStatus(status);
	CEMMissiontoAPIGEE.Mission.Task.TaskTypeCategory taskTypeCategory = new CEMMissiontoAPIGEE.Mission.Task.TaskTypeCategory();
	taskTypeCategory.setName("INSTALACION");
	task.setTaskTypeCategory(taskTypeCategory);

	Marshaller marshaller = JAXBContext.newInstance(CEMMissiontoAPIGEE.class).createMarshaller();
	StringWriter stringWriter = new StringWriter();
	marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
	marshaller.setProperty("com.sun.xml.bind.characterEscapeHandler", new NoEscapeHandler());
	marshaller.marshal(request, stringWriter);
	String payload = stringWriter.toString().substring(55);
	System.out.println(payload);

	HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(
			"https://sandbox.api.tigo.com/v1/tigo/home/work-orders/notifications").openConnection();
	httpURLConnection.setRequestMethod("POST");
	httpURLConnection.setRequestProperty("content-type", "text/xml");

	httpURLConnection.setDoOutput(true);
	try (OutputStream outputStream = httpURLConnection.getOutputStream()) {
	    outputStream.write(payload.getBytes());
	}
	System.out.println(httpURLConnection.getResponseCode());
	System.out.println(httpURLConnection.getResponseMessage());
    }

}
