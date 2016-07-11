package com.qwert.asd.service;

import com.qwert.asd.dao.OwnerDao;
import com.qwert.asd.model.Owner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {
    private OwnerDao ownerDao;

    public void setOwnerDao(OwnerDao ownerDao) {
        this.ownerDao = ownerDao;
    }

    @Override
    @Transactional
    public void addOwner(Owner owner) {
        this.ownerDao.addOwner(owner);
    }

    @Override
    @Transactional
    public void updateOwner(Owner owner) {
        this.ownerDao.updateOwner(owner);
    }

    @Override
    @Transactional
    public void removeOwner(int id) {
        this.ownerDao.removeOwner(id);
    }

    @Override
    @Transactional
    public Owner getOwnerById(int id) {
        return this.ownerDao.getOwnerById(id);
    }

    @Override
    @Transactional
    public List<Owner> listOwners() {
        return this.ownerDao.listOwners();
    }

}
