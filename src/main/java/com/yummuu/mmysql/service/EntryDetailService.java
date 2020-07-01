package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.EntryDetail;
import java.util.List;

public interface EntryDetailService {

	public List<EntryDetail> findAll();

	public EntryDetail getOne(long id);

	public void save(EntryDetail item);

}
