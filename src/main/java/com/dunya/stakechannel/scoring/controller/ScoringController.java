package com.dunya.stakechannel.scoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dunya.stakechannel.scoring.model.AccountScore;

@RestController
@RequestMapping("account-score")
public class ScoringController {
	@GetMapping(value = "/{accountName}")
	public Object getScore(@PathVariable("accountName") String accountName) {
		return new AccountScore(100);
	}

}
