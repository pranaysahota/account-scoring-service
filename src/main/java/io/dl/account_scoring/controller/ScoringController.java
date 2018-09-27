package io.dl.account_scoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.dl.account_scoring.model.AccountScore;

@RestController
public class ScoringController {
	@GetMapping(value = "/getscore/{accountName}")
	public Object getScore(@PathVariable("accountName") String accountName) {
		return new AccountScore(100);
	}
}
