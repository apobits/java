package test.getobjects;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import com.sun.org.apache.xerces.internal.dom.TextImpl;
import org.w3c.dom.Node;

import javax.xml.ws.BindingProvider;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws MalformedURLException, GetObjectsFault {
	URL url = new URL("http://10.5.24.25:8012/ResourcesManager/FSP/GetObjects");
	GetObjects getObjects = new GetObjectsSOAPQSService(url).getGetObjectsSOAPQSPort();
	((BindingProvider) getObjects).getRequestContext()
			.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.toString());
	GetObjectsRequest request = new GetObjectsRequest();
	GetObjectsRequest.GetObjects getObjects1 = new GetObjectsRequest.GetObjects();
	getObjects1.setObjectType("MCPartsInStock");
	request.setGetObjects(getObjects1);
	GetObjectsRequest.GetObjects.Indexes indexes = new GetObjectsRequest.GetObjects.Indexes();
	GetObjectsRequest.GetObjects.Indexes.Index index = new GetObjectsRequest.GetObjects.Indexes.Index();
	indexes.getIndex().add(index);
	getObjects1.setIndexes(indexes);
	index.setHighBound(createHighBound());
	index.setLowBound(createLowBound());
	indexes.setRequestedProperties(createRequestedProperties());

	GetObjectsResponse response = getObjects.getObjects(request);
	if (response.getObjects() != null && response.getObjects().getObject() != null) {
	    Node getObjectsResponse = ((ElementNSImpl) response.getObjects().getObject()).getFirstChild();
	    Node objects = getObjectsResponse.getFirstChild();
	    Node object = objects.getFirstChild();
	    while (object != null) {
		Node partsInStock = object.getFirstChild();
		while (partsInStock != null) {
		    System.out.printf("Name:%s\n Value:%s", partsInStock.getNodeName(),
				    ((TextImpl) partsInStock.getFirstChild()).getData());
		    partsInStock = partsInStock.getNextSibling();
		}
		object = object.getNextSibling();
	    }

	}

    }

    private static GetObjectsRequest.GetObjects.Indexes.RequestedProperties createRequestedProperties() {
	GetObjectsRequest.GetObjects.Indexes.RequestedProperties properties = new GetObjectsRequest.GetObjects.Indexes.RequestedProperties();
	properties.getItem().addAll(Arrays.asList("ExternalRefID", "QuantityInStock", "MaterialType"));
	return properties;
    }

    private static GetObjectsRequest.GetObjects.Indexes.Index.HighBound createHighBound() {
	GetObjectsRequest.GetObjects.Indexes.Index.HighBound highBound = new GetObjectsRequest.GetObjects.Indexes.Index.HighBound();
	GetObjectsRequest.GetObjects.Indexes.Index.HighBound.Property property = new GetObjectsRequest.GetObjects.Indexes.Index.HighBound.Property();
	highBound.getProperty().add(property);
	property.setName("EngineerID");
	property.setValue("avilleda3003");
	return highBound;
    }

    private static GetObjectsRequest.GetObjects.Indexes.Index.LowBound createLowBound() {
	GetObjectsRequest.GetObjects.Indexes.Index.LowBound lowBound = new GetObjectsRequest.GetObjects.Indexes.Index.LowBound();
	GetObjectsRequest.GetObjects.Indexes.Index.LowBound.Property property = new GetObjectsRequest.GetObjects.Indexes.Index.LowBound.Property();
	lowBound.getProperty().add(property);
	property.setName("EngineerID");
	property.setValue("avilleda3003");
	return lowBound;
    }
}
