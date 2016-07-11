package com.qwert.asd.service;

import com.qwert.asd.model.Owner;

import java.util.List;

public interface OwnerService {

    void addOwner(Owner owner);

    void updateOwner(Owner owner);

    void removeOwner(int id);

    Owner getOwnerById(int id);

    List<Owner> listOwners();
}
