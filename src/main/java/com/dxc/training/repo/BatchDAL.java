package com.dxc.training.repo;

import java.util.List;

import com.dxc.training.model.Batch;

public interface BatchDAL {
	Batch save(Batch b);
	List<Batch> findAll();
}
