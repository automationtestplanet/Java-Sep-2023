package annotation;

<<<<<<< Updated upstream
<<<<<<< HEAD
=======
>>>>>>> Stashed changes
//@ImportantAnnotation(data1="Hellow")
public class AnnotationEx {
	public static void main(String[] args) {
	AnnotationEx anoEx = new AnnotationEx();
Class cls = anoEx.getClass();
ImportantAnnotation imp = (ImportantAnnotation)cls.getAnnotation(ImportantAnnotation.class);
//	System.out.println(imp.data1());
	
<<<<<<< Updated upstream
=======
import java.lang.annotation.Annotation;


public class AnnotationEx {
	
	@Important(data1="Hello",data2="Hello")
	void method1() {
		
	}
	
	public static void main(String[] args) {
		
		AnnotationEx anoEx = new AnnotationEx();
		
		Class cls = anoEx.getClass();		
		Annotation imp = cls.getAnnotation(Important.class);
		Important impAnno = (Important)imp;
		
		System.out.println(impAnno.data1());
		System.out.println(impAnno.data2());		

>>>>>>> cbedbb4ca4db9e841da66bdd6e219bf765a9fa8b
=======
>>>>>>> Stashed changes
	}

}
