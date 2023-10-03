package annotation;

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

	}

}
