package com.dunya.stakechannel.scoring.model;

public class Account {
	private String accountName;
	private boolean isBlacklisted;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public boolean isBlacklisted() {
		return isBlacklisted;
	}

	public void setBlacklisted(boolean isBlacklisted) {
		this.isBlacklisted = isBlacklisted;
	}

	public Account(String accountName, boolean isBlacklisted) {
		this.accountName = accountName;
		this.isBlacklisted = isBlacklisted;
	}
}
