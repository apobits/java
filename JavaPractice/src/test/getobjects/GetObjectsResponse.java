
package test.getobjects;

import javax.xml.bind.annotation.*;

/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Objects">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Object" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objects"
})
@XmlRootElement(name = "GetObjectsResponse", namespace = "http://xmlns.tigo.com/TigoFS/FieldServiceProxy/GetObjectsResponse/V1/schema")
public class GetObjectsResponse {

    @XmlElement(name = "Objects", namespace = "http://xmlns.tigo.com/TigoFS/FieldServiceProxy/GetObjectsResponse/V1/schema", required = true)
    protected Objects objects;

    /**
     * Obtiene el valor de la propiedad objects.
     *
     * @return
     *     possible object is
     *     {@link Objects }
     *
     */
    public Objects getObjects() {
        return objects;
    }

    /**
     * Define el valor de la propiedad objects.
     *
     * @param value
     *     allowed object is
     *     {@link Objects }
     *
     */
    public void setObjects(Objects value) {
        this.objects = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Object" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "object"
    })
    public static class Objects {

        @XmlElement(name = "Object", namespace = "http://xmlns.tigo.com/TigoFS/FieldServiceProxy/GetObjectsResponse/V1/schema", required = true)
        protected Object object;

        /**
         * Obtiene el valor de la propiedad object.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getObject() {
            return object;
        }

        /**
         * Define el valor de la propiedad object.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setObject(Object value) {
            this.object = value;
        }

    }

}
