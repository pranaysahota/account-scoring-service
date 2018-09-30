package com.dunya.stakechannel.scoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dunya.stakechannel.scoring.model.Account;
import com.dunya.stakechannel.scoring.model.BlacklistStatus;
import com.dunya.stakechannel.scoring.model.UpdateStatus;


@RestController
@RequestMapping("/blacklist")
public class BlacklistingController {
	@GetMapping(value = "/{accountName}")
	public Object isBlacklisted(@PathVariable("accountName") String accountName) {
		return new Account(accountName, false);
	}

	@PostMapping(value = "")
	public Object blacklist(@RequestBody Account account) {
		BlacklistStatus status = new BlacklistStatus();
		status.setStatus(UpdateStatus.SUCCESS);
		return status;
	}
}
