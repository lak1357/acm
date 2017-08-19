package com.acm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acm.model.Account;
import com.acm.model.Response;
import com.acm.repository.AccountRepository;

@RestController
public class AccountController {

	@Autowired
	AccountRepository accountRepository;

	@RequestMapping(method = RequestMethod.GET, path = "/accounts")
	public ResponseEntity<Response> getUsers() {
		Iterable<Account> users = accountRepository.findAll();
		Response r = new Response(true, users);
		return new ResponseEntity<Response>(r, HttpStatus.OK);
	}
}
