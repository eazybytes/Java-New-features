/**
 * 
 */
package com.eazybytes.java8.optional;

import java.util.Optional;

/**
 * @author EazyBytes
 *
 */
public class UserOptional {

	private Optional<Order> order;

	public Optional<Order> getOrder() {
		return order;
	}

	public class Order {
		private Optional<Item> item;

		public Optional<Item> getItem() {
			return item;
		}
	}

	public class Item {
		private String name;

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}

	public String getUserOrderDetails(Optional<UserOptional> user) {
		return user.flatMap(UserOptional::getOrder)
				   .flatMap(Order::getItem).map(Item::getName)
				   .orElse("Not Available");

	}
}
