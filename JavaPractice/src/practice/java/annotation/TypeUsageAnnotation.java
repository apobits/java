/**
 * 
 */
package practice.java.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(ElementType.TYPE_USE)
/**
 * @author aposo
 *
 */
public @interface TypeUsageAnnotation {

}
