/**
 * 
 */
package ortiz.perez.albin.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author aposo
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@interface RepetableContainer {
    Repetable[] value();
}
