package com.dxc.training.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dxc.training.model.Track;

@Repository
public class TrackDALImp implements TrackDAL{
	
	@Override
	public List<Track> findAll() {
		return mongo.findAll(Track.class);
	}
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Track save(Track track){
		return mongo.save(track);
	}
}
