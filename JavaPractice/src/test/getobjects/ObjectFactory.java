
package test.getobjects;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.millicom.rm.sync.client.click.getobjects package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.millicom.rm.sync.client.click.getobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetObjectsRequest }
     * 
     */
    public GetObjectsRequest createGetObjectsRequest() {
        return new GetObjectsRequest();
    }

    /**
     * Create an instance of {@link GetObjectsResponse }
     * 
     */
    public GetObjectsResponse createGetObjectsResponse() {
        return new GetObjectsResponse();
    }

    /**
     * Create an instance of {@link GetObjectsRequest.GetObjects }
     * 
     */
    public GetObjectsRequest.GetObjects createGetObjectsRequestGetObjects() {
        return new GetObjectsRequest.GetObjects();
    }

    /**
     * Create an instance of {@link GetObjectsRequest.GetObjects.Indexes }
     * 
     */
    public GetObjectsRequest.GetObjects.Indexes createGetObjectsRequestGetObjectsIndexes() {
        return new GetObjectsRequest.GetObjects.Indexes();
    }

    /**
     * Create an instance of {@link GetObjectsRequest.GetObjects.Indexes.Index }
     * 
     */
    public GetObjectsRequest.GetObjects.Indexes.Index createGetObjectsRequestGetObjectsIndexesIndex() {
        return new GetObjectsRequest.GetObjects.Indexes.Index();
    }

    /**
     * Create an instance of {@link GetObjectsRequest.GetObjects.Indexes.Index.HighBound }
     * 
     */
    public GetObjectsRequest.GetObjects.Indexes.Index.HighBound createGetObjectsRequestGetObjectsIndexesIndexHighBound() {
        return new GetObjectsRequest.GetObjects.Indexes.Index.HighBound();
    }

    /**
     * Create an instance of {@link GetObjectsRequest.GetObjects.Indexes.Index.LowBound }
     * 
     */
    public GetObjectsRequest.GetObjects.Indexes.Index.LowBound createGetObjectsRequestGetObjectsIndexesIndexLowBound() {
        return new GetObjectsRequest.GetObjects.Indexes.Index.LowBound();
    }

    /**
     * Create an instance of {@link GetObjectsResponse.Objects }
     * 
     */
    public GetObjectsResponse.Objects createGetObjectsResponseObjects() {
        return new GetObjectsResponse.Objects();
    }

    /**
     * Create an instance of {@link ResourcesManagerFault }
     * 
     */
    public ResourcesManagerFault createResourcesManagerFault() {
        return new ResourcesManagerFault();
    }

    /**
     * Create an instance of {@link GetObjectsRequest.GetObjects.Indexes.RequestedProperties }
     * 
     */
    public GetObjectsRequest.GetObjects.Indexes.RequestedProperties createGetObjectsRequestGetObjectsIndexesRequestedProperties() {
        return new GetObjectsRequest.GetObjects.Indexes.RequestedProperties();
    }

    /**
     * Create an instance of {@link GetObjectsRequest.GetObjects.Indexes.Index.HighBound.Property }
     * 
     */
    public GetObjectsRequest.GetObjects.Indexes.Index.HighBound.Property createGetObjectsRequestGetObjectsIndexesIndexHighBoundProperty() {
        return new GetObjectsRequest.GetObjects.Indexes.Index.HighBound.Property();
    }

    /**
     * Create an instance of {@link GetObjectsRequest.GetObjects.Indexes.Index.LowBound.Property }
     * 
     */
    public GetObjectsRequest.GetObjects.Indexes.Index.LowBound.Property createGetObjectsRequestGetObjectsIndexesIndexLowBoundProperty() {
        return new GetObjectsRequest.GetObjects.Indexes.Index.LowBound.Property();
    }

}
