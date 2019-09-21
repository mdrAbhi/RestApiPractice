package com.RestApi.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;



public class AbstractRepo {
	
	protected EntityManager entityManager;

	public EntityManager getEmanagerEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEmanagerEntityManager(EntityManager emanagerEntityManager) {
		this.entityManager = emanagerEntityManager;
	}
	
	

}
