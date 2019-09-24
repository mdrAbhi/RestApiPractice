package com.RestApi.Repository;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.RestApi.Dto.ArtistDto;
import com.RestApi.Dto.AlbumDto;
import com.RestApi.Entity.ArtistEntity;

@Repository
@Transactional
public class ArtistRepo extends AbstractRepo {

	public void save(ArtistEntity artistEntity) {
		entityManager.persist(artistEntity);
	}

	public ArtistEntity getByID(Long id) {
		ArtistEntity artist = entityManager.find(ArtistEntity.class, id);
		return artist;
	}

	public List<ArtistEntity> getByName(String name) {
		Query query = (Query) entityManager.createQuery("Select A From ArtistEntity A Where A.name= :nameprm");
		query.setParameter("nameprm", name);
		return query.getResultList();
	}

}
