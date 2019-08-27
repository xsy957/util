package com.tedu.sp09.service;

import com.tedu.pojo.Order;
import com.tedu.web.util.JsonResult;

public class OrderFeignServiceFB implements OrderFeignService {

	@Override
	public JsonResult<Order> getOrder(String orderId) {
		// TODO Auto-generated method stub
		return JsonResult.err("无法获取商品订单");
	}

	@Override
	public JsonResult addOrder() {
		// TODO Auto-generated method stub
		return JsonResult.err("无法保存订单");
	}

}
