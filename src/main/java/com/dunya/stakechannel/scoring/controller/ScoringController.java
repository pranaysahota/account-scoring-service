package com.dunya.stakechannel.scoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dunya.stakechannel.scoring.model.Account;
import com.dunya.stakechannel.scoring.model.AccountScore;
import com.dunya.stakechannel.scoring.model.BlacklistStatus;
import com.dunya.stakechannel.scoring.model.UpdateStatus;

@RestController
public class ScoringController {
	@GetMapping(value = "/score/{accountName}")
	public Object getScore(@PathVariable("accountName") String accountName) {
		return new AccountScore(100);
	}

	@GetMapping(value = "/blacklist/{accountName}")
	public Object isBlacklisted(@PathVariable("accountName") String accountName) {
		return new Account(accountName, false);
	}

	@PostMapping(value = "/blacklist")
	public Object blacklist(@RequestBody Account account) {
		BlacklistStatus status = new BlacklistStatus();
		status.setStatus(UpdateStatus.SUCCESS);
		return status;
	}
}
