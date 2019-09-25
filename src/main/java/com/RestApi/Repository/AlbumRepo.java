package com.RestApi.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.RestApi.Dto.ArtistDto;
import com.RestApi.Dto.AlbumDto;
import com.RestApi.Entity.AlbumEntity;
import com.RestApi.Entity.ArtistEntity;

@Repository
@Transactional
public class AlbumRepo extends AbstractRepo {

	public void save(AlbumEntity albumEntity) {
		entityManager.persist(albumEntity);
	}

	public AlbumEntity getById(Long albumId) {
		return entityManager.find(AlbumEntity.class, albumId);
	}

	public AlbumEntity getAlbumByid(Long aId) {
		AlbumEntity aEntity = entityManager.find(AlbumEntity.class, aId);
		return aEntity;
	}

};
