/**
 * 
 */
package practice.java.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;

/**
 * @author apobits@gmail.com
 *
 */
public class JaxbExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	try {
	    File f = new File("C:\\Users\\Administrador\\Desktop\\mypackage\\Person.java");
	    Person p = new Person();
	    p.setAge(36);
	    p.setColor("White");
	    p.setHeight(177);
	    p.setIsTeenager(false);
	    p.setLastName("Perez");
	    p.setName("Albin");
	    p.setNationality("Colombian");
	    p.setSurName("Ortiz");
	    p.setWeight(87);
	    JAXBContext ctx = JAXBContext.newInstance(Person.class);
	    ctx.createMarshaller().marshal(p, f);

	    Person p1 = (Person) ctx.createUnmarshaller().unmarshal(f);
	    System.out.println("p " + p.toString());
	    System.out.println("p1 " + p1.toString());

	} catch (Exception e) {

	}

    }

}
