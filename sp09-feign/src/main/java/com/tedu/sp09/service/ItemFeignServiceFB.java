package com.tedu.sp09.service;

import java.util.List;

import com.tedu.pojo.Item;
import com.tedu.web.util.JsonResult;

public class ItemFeignServiceFB implements ItemFeignService {

	@Override
	public JsonResult<List<Item>> getItems(String oderId) {
		return JsonResult.err("无法获取订单商品列表");
	}

	@Override
	public JsonResult decscreaseNumber(List<Item> items) {
		return JsonResult.err("无法修改商品库存");
	}

}
