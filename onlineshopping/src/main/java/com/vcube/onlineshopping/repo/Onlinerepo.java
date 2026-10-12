
package com.vcube.onlineshopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.onlineshopping.model.Onlinemodel;

@Repository
public interface Onlinerepo
        extends JpaRepository<Onlinemodel, Integer> {

}