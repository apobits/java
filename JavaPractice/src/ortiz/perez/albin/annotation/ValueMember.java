/**
 * 
 */
package ortiz.perez.albin.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
/**
 * @author Administrador
 *
 */
public @interface ValueMember {
	
	String value();
	
	String lastName() default "Perez";

}
