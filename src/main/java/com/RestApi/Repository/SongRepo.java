package com.RestApi.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.RestApi.Entity.SongEntity;

@Repository
@Transactional
public class SongRepo extends AbstractRepo {

	public void save(SongEntity songEntity) {
		entityManager.persist(songEntity);
	}
	
}
