package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		
		Method[] calculatorMethods = Calculator.class.getMethods();
		
		for(Method eachMehod:calculatorMethods) {
			System.out.println(eachMehod.getName());
		}
		
		Calculator calc = new Calculator();
		
		Object[] values = {30,40};
		
		Calculator2 calc2 = new Calculator2();
		
		for(Method eachMehod:calculatorMethods) {
			String methodName = eachMehod.getName();
			if(methodName.equals("modDivision")) {
				eachMehod.invoke(calc, values);
			}else {
				Method[] methodName2 = Calculator2.class.getMethods();
				for(Method eachMehod1:methodName2) {
					String methodName1 = eachMehod1.getName();
					if(methodName1.equals("modDivision")) {						
						eachMehod1.invoke(calc2, values);
					}
				}
				break;
			}			
		}
				
		Object[] values2 = {};
		Method division = Calculator.class.getDeclaredMethod("division");
		division.setAccessible(true);
		division.invoke(calc, values2);

	}

}
