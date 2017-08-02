/**
 * 
 */
package ortiz.perez.albin.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
/**
 * @author aposo
 *
 */
public @interface MyAnnotation {
    
    String name() default "Albin";

}
