package inner.classes;

public class OuterClass {
	
	static int a = 100;
	int b = 200;
	
	void methodAnnonymus() {
		System.out.println("Outer class method");
	}

//	Inner Instance class
	class InstanceIneerClass{
		int c = 300;
		int d = 400;
		
		void method1() {
			System.out.println("Inner Instance Class Method1()");
		}
	}
	
	
//	Inner Static CLass
	static class StaticIneerClass{
		static int e = 500;
		static int f = 600;
		
		static void method2() {
			System.out.println("Inner static Class Method2()");
		}
		
		void method3() {
			System.out.println("Inner static Class Method3()");
		}
	}
	
//	Inner Instance class without name -> Annonymus class
	{
		int a = 100;
		System.out.println(a);
		System.out.println("Inner Instance class without name -> Annonymus block");
	};
	

//	Inner static class without name -> static blocks
	static {
		System.out.println("Inner Static class without name -> static block");
	};
	
	
	interface InnerInstnaceInterface{
		
	}
	
	enum InnerInstnaceEnum{
		
	}
	
	
	public static void main(String[] args) {		
		
		OuterClass outCls = new OuterClass();
		
		System.out.println("Hello Java");
		
		System.out.println(outCls.b);
		
		OuterClass.InstanceIneerClass innerInstanceCls = outCls.new InstanceIneerClass();
		innerInstanceCls.method1();
		System.out.println(innerInstanceCls.c);
		
		System.out.println(OuterClass.StaticIneerClass.e);
		OuterClass.StaticIneerClass.method2();
		
		OuterClass.StaticIneerClass staticInnerCls = new StaticIneerClass();
		staticInnerCls.method3();
		
		OuterClass outCls2 = new OuterClass(){
			@Override
			void methodAnnonymus() {
				System.out.println("Annoimus class method");
			}
		};
		
		outCls2.methodAnnonymus();
		
	}

}
