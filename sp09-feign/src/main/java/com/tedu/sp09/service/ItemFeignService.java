package com.tedu.sp09.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tedu.pojo.Item;
import com.tedu.web.util.JsonResult;

@FeignClient(name="item_service",fallback=ItemFeignServiceFB.class)
public interface ItemFeignService {
	@GetMapping("/{orderId")
	JsonResult<List<Item>>getItems(@PathVariable String oderId);
	
	@PostMapping("/decreaseNumber")
	JsonResult decscreaseNumber(@RequestBody List<Item>items);
}
