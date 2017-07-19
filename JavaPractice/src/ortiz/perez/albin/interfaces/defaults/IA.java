/**
 * 
 */
package ortiz.perez.albin.interfaces.defaults;

/**
 * @author Administrador
 *
 */
public class IA implements IFA,IFB{

	// had to override because interfaces IFA and IFB have same defaults methods
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		IFA.super.doSomething();
	}



}
