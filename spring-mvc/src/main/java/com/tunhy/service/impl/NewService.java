package com.tunhy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunhy.dao.INewDAO;
import com.tunhy.model.NewModel;
import com.tunhy.service.INewService;



@Service
public class NewService implements INewService {
	
	@Autowired
	private INewDAO newDao;
	
	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}
}
