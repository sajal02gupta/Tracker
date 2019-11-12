package com.dxc.training.repo;

import java.util.List;

import com.dxc.training.model.Assessments;

public interface AssessmentsDAL {
	Assessments save(Assessments a);
	
	List<Assessments> findAll();
}
