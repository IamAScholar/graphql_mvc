package com.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.CbObjectsDaoMapper;
import com.springmvc.model.CbObjectsDao;
import com.springmvc.model.CbObjectsDaoExample;
import com.springmvc.service.ObjServer;

@Service
public class ObjServerImp implements ObjServer{
	@Autowired
	private CbObjectsDaoMapper cbObjectsDaoMapper;

	public int deleteByPrimaryKey(String id) {
		return cbObjectsDaoMapper.deleteByPrimaryKey(id);
	}

	public int insert(CbObjectsDao record) {
		return cbObjectsDaoMapper.insert(record);
	}

	public int insertSelective(CbObjectsDao record) {
		return cbObjectsDaoMapper.insert(record);
	}

	public CbObjectsDao selectByPrimaryKey(String id){
	return cbObjectsDaoMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(CbObjectsDao record){
		return cbObjectsDaoMapper.updateByPrimaryKey(record);
	}
	
	public int updateByPrimaryKeyWithBLOBs(CbObjectsDao record){
		return cbObjectsDaoMapper.updateByPrimaryKeyWithBLOBs(record);
	}
	
	public int updateByPrimaryKey(CbObjectsDao record){
		return cbObjectsDaoMapper.updateByPrimaryKey(record);
	}

	public List<CbObjectsDao> selectByExampleWithBLOBs(CbObjectsDaoExample example) {
		
		return cbObjectsDaoMapper.selectByExampleWithBLOBs(example);
	}

	public List<CbObjectsDao> selectByExample(CbObjectsDaoExample example) {
		// TODO Auto-generated method stub
		return cbObjectsDaoMapper.selectByExample(example);
	}
}
