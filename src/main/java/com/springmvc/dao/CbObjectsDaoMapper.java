package com.springmvc.dao;

import com.springmvc.model.CbObjectsDao;
import com.springmvc.model.CbObjectsDaoExample;
import java.util.List;

public interface CbObjectsDaoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CbObjectsDao record);

    int insertSelective(CbObjectsDao record);

    List<CbObjectsDao> selectByExampleWithBLOBs(CbObjectsDaoExample example);

    List<CbObjectsDao> selectByExample(CbObjectsDaoExample example);

    CbObjectsDao selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CbObjectsDao record);

    int updateByPrimaryKeyWithBLOBs(CbObjectsDao record);

    int updateByPrimaryKey(CbObjectsDao record);
}