package com.zc.controller;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zc.pojo.pp;
import com.zc.service.ppService;

@Controller
public class ppController {
	@Autowired
	ppService service;
	@RequestMapping("/allBrands")
	@ResponseBody
public List<pp> selectAll(){
	List<pp> list = service.selectAll();
	return list;
}
@RequestMapping("/delBrand")
@ResponseBody
public int delBrand(int id) {
	int row = service.delbrand(id);
	return row;
}
@RequestMapping("/addBrand")
@ResponseBody
public int addBrand(@RequestBody pp a) {
	int row=service.addbrand(a);
	return row;	
}
}
