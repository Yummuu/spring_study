package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Order;
import java.util.List;

public interface OrderService {

	public List<Order> findAll();

	public Order getOne(long id);

	public void save(Order item);

}
