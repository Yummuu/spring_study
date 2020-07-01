package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Comments;
import com.yummuu.mmysql.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Comments")
public class CommentsController{
	@Autowired
	private CommentsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Comments> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Comments info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Comments item){
		itemService.save(item);
	}
}
