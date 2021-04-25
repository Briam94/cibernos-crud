package com.co.cibernos.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.co.cibernos.entities.Jobs;

@Repository
public class JobsDao extends AbstractDao<Jobs> {

	public JobsDao() {
		super(Jobs.class);
	}

	@PersistenceContext
    private EntityManager em;
	
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
