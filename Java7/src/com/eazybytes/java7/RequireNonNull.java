/**
 * 
 */
package com.eazybytes.java7;

import java.util.Objects;

/**
 * @author EazyBytes
 *
 */
public class RequireNonNull {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = null;
		processPersonDetails(person);
	}
	
	private static void processPersonDetails(Person person) {
		Objects.requireNonNull(person, "Person object can't be null");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
	}
	
	public class Person {
		private String firstName;
		private String lastName;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

	}

}
