package com.zc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zc.pojo.pp;
@Repository
public interface ppMapper {
List<pp> selectAll();

int delbrand(int id);
int addbrand(pp a);
}
