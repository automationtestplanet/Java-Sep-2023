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
				Method modDivMethod = Calculator2.class.getDeclaredMethod("modDivision", new Class[] {int.class,int.class});
				modDivMethod.invoke(calc2, values);
				break;
			}			
		}
		
		int[] intArr = {10,20,30};		
		int[] intArr2 = new int[]{10,20,30};
		Class[] clsArr = new Class[] {int.class,int.class};
				
		Method division = Calculator.class.getDeclaredMethod("division",clsArr);
		division.setAccessible(true);
		division.invoke(calc, values);

	}

}
