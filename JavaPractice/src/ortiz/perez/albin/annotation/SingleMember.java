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
public @interface SingleMember {

	String value() default "Albin";

}
