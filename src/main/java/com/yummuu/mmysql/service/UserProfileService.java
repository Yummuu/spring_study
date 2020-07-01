package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.UserProfile;
import java.util.List;

public interface UserProfileService {

	public List<UserProfile> findAll();

	public UserProfile getOne(long id);

	public void save(UserProfile item);

}
