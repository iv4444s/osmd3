package com.qwert.asd.dao;

import com.qwert.asd.model.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OwnerDaoImpl implements OwnerDao {
    private static final Logger logger = LoggerFactory.getLogger(OwnerDaoImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void addOwner(Owner owner) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(owner);
        logger.info("Owner successfully saved. Owner details: " + owner);
    }


    @Override
    public void updateOwner(Owner owner) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(owner);
        logger.info("Owner successfully saved. Owner details: " + owner);
    }

    @Override
    public void removeOwner(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        Owner owner = (Owner) session.load(Owner.class, new Integer(id));
        if (owner!=null){
            session.delete(owner);
        }
        logger.info("Owner successfully removed. Owner details: " + owner);
    }

    @Override
    public Owner getOwnerById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Owner owner = (Owner) session.load(Owner.class, new Integer(id));
        logger.info("Owner successfully loaded. Owner details: " + owner);
        return owner;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Owner> listOwners() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Owner> ownerList = session.createQuery("from Owner").list();

        for(Owner owner: ownerList){
            logger.info("Owner list: " + owner);
        }

        return ownerList;
    }
}
