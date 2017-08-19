package com.acm.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.acm.model.Role;


@Transactional
public interface RoleRepository extends CrudRepository<Role, Long>
{

}
