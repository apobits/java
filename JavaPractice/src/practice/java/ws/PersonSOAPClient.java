/**
 * 
 */
package practice.java.ws;

import java.net.MalformedURLException;
import java.net.URL;

import practice.java.ws.person.classes.NamingException_Exception;
import practice.java.ws.person.classes.Person;
import practice.java.ws.person.classes.PersonService;

/**
 * @author apobits@gmail.com
 *
 */
public class PersonSOAPClient {

    /**
     * @param args
     * @throws MalformedURLException
     * @throws NamingException_Exception
     */
    public static void main(String[] args) throws MalformedURLException, NamingException_Exception {

	PersonService ps = new PersonService(new URL("http://localhost:8081/LearningWeb/Person?wsdl"));
	Person p = ps.getPersonPort().getPerson(1);
	System.out.println(p.getName() + " " + p.getLastName());

    }

}
