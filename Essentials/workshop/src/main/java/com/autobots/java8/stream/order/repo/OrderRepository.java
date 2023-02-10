package com.autobots.java8.stream.order.repo;

import com.autobots.java8.stream.order.entity.Order;

public interface OrderRepository {
	void save(Order order);
}
