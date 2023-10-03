package annotation;

//@ImportantAnnotation(data1="Hellow")
public class AnnotationEx {
	public static void main(String[] args) {
	AnnotationEx anoEx = new AnnotationEx();
Class cls = anoEx.getClass();
ImportantAnnotation imp = (ImportantAnnotation)cls.getAnnotation(ImportantAnnotation.class);
//	System.out.println(imp.data1());
	
	}

}
