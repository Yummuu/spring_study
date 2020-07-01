package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Scores;
import java.util.List;

public interface ScoresService {

	public List<Scores> findAll();

	public Scores getOne(long id);

	public void save(Scores item);

}
