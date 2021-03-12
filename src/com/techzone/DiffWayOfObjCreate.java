//Different ways of creating objects in java
package com.techzone;

import java.lang.reflect.Constructor;

public class DiffWayOfObjCreate implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void message(String message) {
		System.out.println("Object created using " + message);
	}

	public static void main(String[] args) {

		// creating object using "new" key word
		DiffWayOfObjCreate newObj = new DiffWayOfObjCreate();
		newObj.message("\"new\" key word");

		// creating object using "new instance"
		try {
			Class<?> clas = Class.forName("com.techzone.DiffWayOfObjCreate");
			DiffWayOfObjCreate obj = (DiffWayOfObjCreate) clas.newInstance();
			obj.message("\"new instance\" method");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		// creating object using "clone"
		try {
			DiffWayOfObjCreate cloneObj = (DiffWayOfObjCreate) newObj.clone();
			cloneObj.message("\"clone\" ");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// creating object using "newInstance() method of Constructor class"
		try {
			Constructor<DiffWayOfObjCreate> constructor = DiffWayOfObjCreate.class.getDeclaredConstructor();
			DiffWayOfObjCreate constObj = constructor.newInstance();
			constObj.message("newInstance() method of Constructor class");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
