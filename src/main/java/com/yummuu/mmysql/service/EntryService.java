package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Entry;
import java.util.List;

public interface EntryService {

	public List<Entry> findAll();

	public Entry getOne(long id);

	public void save(Entry item);

}
