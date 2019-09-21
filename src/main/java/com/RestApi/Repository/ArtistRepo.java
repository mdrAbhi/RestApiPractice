package com.RestApi.Repository;



import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.RestApi.Entity.ArtistEntity;

@Repository
@Transactional
public class ArtistRepo extends AbstractRepo{
	
	
	
	public void save(ArtistEntity artistEntity) {
		entityManager.persist(artistEntity);
	}
	
	

}
