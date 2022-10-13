package com.multisense.pages.CommandLimitationPage;

import com.base.base.TestBase;

public class PendingChangesInCommandLimitationRulePage extends TestBase {

	public PendingChangesInCommandLimitationRulePage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
			login();
		}
	}
}
