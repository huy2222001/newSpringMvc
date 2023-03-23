package com.tunhy.dao;

import java.util.List;

import com.tunhy.model.NewModel;
import com.tunhy.paging.Pageble;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findAll();
}