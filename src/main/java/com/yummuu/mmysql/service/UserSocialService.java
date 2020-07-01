package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.UserSocial;
import java.util.List;

public interface UserSocialService {

	public List<UserSocial> findAll();

	public UserSocial getOne(long id);

	public void save(UserSocial item);

}
