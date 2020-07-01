package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Refund;
import java.util.List;

public interface RefundService {

	public List<Refund> findAll();

	public Refund getOne(long id);

	public void save(Refund item);

}
