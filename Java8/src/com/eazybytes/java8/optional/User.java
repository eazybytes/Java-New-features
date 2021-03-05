/**
 * 
 */
package com.eazybytes.java8.optional;

/**
 * @author EazyBytes
 *
 */
public class User {

	private Order order;

	public Order getOrder() {
		return order;
	}

	public class Order {
		private Item item;

		public Item getItem() {
			return item;
		}
	}

	public class Item {
		private String name;

		public String getName() {
			return name;
		}
	}

	public String getUserOrderDetails(User user) {
		if (user != null) {
			Order order = user.getOrder();
			if (order != null) {
				Item item = order.getItem();
				if (item != null) {
					return item.getName();
				}
			}
		}
		return "Not Available";
	}
}
