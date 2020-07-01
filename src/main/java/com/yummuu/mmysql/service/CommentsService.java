package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Comments;
import java.util.List;

public interface CommentsService {

	public List<Comments> findAll();

	public Comments getOne(long id);

	public void save(Comments item);

}
