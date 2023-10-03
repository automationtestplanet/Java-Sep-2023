package data.access;

import interface1.AccessInterface;
import interface1.FullAbstraction;

public class UseInterface {

	public static void main(String[] args) {
		FullAbstraction fullAbs = new AccessInterface();
		
		System.out.println(fullAbs.addition(30, 40));
		
		System.out.println(FullAbstraction.a);

	}

}
