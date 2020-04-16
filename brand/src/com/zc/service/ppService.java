package com.zc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zc.pojo.pp;

public interface ppService {
List<pp> selectAll();

int delbrand(int id);
int addbrand(pp a);

}
