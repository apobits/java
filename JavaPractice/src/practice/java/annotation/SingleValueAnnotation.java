/**
 * 
 */
package practice.java.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
/**
 * @author aposo
 *
 */
public @interface SingleValueAnnotation {
	// Single value annotations must have the variable name value
	String value();

}
