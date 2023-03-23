package com.tunhy.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tunhy.dao.INewDAO;
import com.tunhy.mapper.NewMapper;
import com.tunhy.model.NewModel;


@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	
	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		return query(sql.toString(), new NewMapper());
	}
}
