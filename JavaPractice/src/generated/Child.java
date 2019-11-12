//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantacion de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderan si se vuelve a compilar el esquema de origen.
// Generado el: 2018.02.07 a las 09:44:33 AM COT 
//

package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para child complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="child">
 *   &lt;complexContent>
 *     &lt;extension base="{}person">
 *       &lt;sequence>
 *         &lt;element name="crawling" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="walking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "child", propOrder = { "crawling", "walking" })
public class Child extends Person {

	protected boolean crawling;
	protected boolean walking;

	/**
	 * Obtiene el valor de la propiedad crawling.
	 * 
	 */
	public boolean isCrawling() {
		return crawling;
	}

	/**
	 * Define el valor de la propiedad crawling.
	 * 
	 */
	public void setCrawling(boolean value) {
		this.crawling = value;
	}

	/**
	 * Obtiene el valor de la propiedad walking.
	 * 
	 */
	public boolean isWalking() {
		return walking;
	}

	/**
	 * Define el valor de la propiedad walking.
	 * 
	 */
	public void setWalking(boolean value) {
		this.walking = value;
	}

}
