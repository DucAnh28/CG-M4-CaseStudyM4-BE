package com.ducanh.casestudy.repository.jwt;


import com.ducanh.casestudy.model.AppRole;
import org.springframework.data.repository.CrudRepository;

public interface IAppRoleRepo extends CrudRepository<AppRole, Long> {
    AppRole findByName(String name);
}
