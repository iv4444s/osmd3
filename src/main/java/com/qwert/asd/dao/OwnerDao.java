package com.qwert.asd.dao;


import com.qwert.asd.model.Owner;

import java.util.List;

public interface OwnerDao {

    void addOwner(Owner owner);

    void updateOwner(Owner owner);

    void removeOwner(int id);

    Owner getOwnerById(int id);


    List<Owner> listOwners();
}
