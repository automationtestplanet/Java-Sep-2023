package annotation;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(CLASS)
@Target(ElementType.TYPE)
public @interface ImportantAnnotation {

//	Public String data1();
	
}
