package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Comments;
import com.yummuu.mmysql.repository.CommentsJpaRepository;
import com.yummuu.mmysql.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService{
	@Autowired
	private CommentsJpaRepository itemRepository;

	@Override
	public List<Comments> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Comments getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Comments item){
		itemRepository.save(item);
	}
}
