package com.acm.repository;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.acm.model.User;


@Transactional
public interface UserRepository extends CrudRepository<User, Long>
{
	
	public User findByName(String name);

	public User findByUsername(String username);
	
}
