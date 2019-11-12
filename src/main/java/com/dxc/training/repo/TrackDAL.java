package com.dxc.training.repo;

import java.util.List;

import com.dxc.training.model.Track;

public interface TrackDAL {
	
	List<Track> findAll();
	
	Track save(Track t);
}
