package com.acm.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.acm.model.Account;

@Transactional
public interface AccountRepository extends CrudRepository<Account, Long> {

	public Account findByName(String name);

	public Account findByUsername(String username);

	public Account findByAccountId(String accountId);

}
