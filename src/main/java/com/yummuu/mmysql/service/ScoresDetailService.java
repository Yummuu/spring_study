package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.ScoresDetail;
import java.util.List;

public interface ScoresDetailService {

	public List<ScoresDetail> findAll();

	public ScoresDetail getOne(long id);

	public void save(ScoresDetail item);

}
