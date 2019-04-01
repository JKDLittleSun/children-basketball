package com.lsun.api.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lsun.api.service.CollectSortService;
import com.lsun.common.base.BaseController;

@RestController
@RequestMapping("/collect-sort")
public class CollectSortController extends BaseController {
	
	@Autowired
	private CollectSortService sortService;
	
	@GetMapping("list")
	public Object list(@RequestParam Map<String, Object> params) {
		return success(sortService.selectPage(params));
	}
	
}
