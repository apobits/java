/**
 * 
 */
package ortiz.perez.albin.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

@Retention(RUNTIME)
@Repeatable(RepetableContainer.class)
public @interface Repetable {

    String name();

}
