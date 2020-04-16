package com.zc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zc.mapper.ppMapper;
import com.zc.pojo.pp;
import com.zc.service.ppService;
@Service
public class ppServiceImpl implements ppService{
	@Autowired
       ppMapper mapper;
	
	@Override
	public List<pp> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	@Override
	public int delbrand(int id) {
		// TODO Auto-generated method stub
		return mapper.delbrand(id);
	}

	@Override
	public int addbrand(pp a) {
		// TODO Auto-generated method stub
		return mapper.addbrand(a);
	}

}
