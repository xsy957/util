package com.tedu.sp09.service;

import com.tedu.pojo.User;
import com.tedu.web.util.JsonResult;

public class UserFeignServiceFB implements UserFeignService {

	@Override
	public JsonResult<User> getUser(Integer userId) {
		// TODO Auto-generated method stub
		return JsonResult.err("无法获取用户信息");
	}

	@Override
	public JsonResult addScore(Integer userId, Integer score) {
		// TODO Auto-generated method stub
		return JsonResult.err("无法增加用户积分");
	}

}
