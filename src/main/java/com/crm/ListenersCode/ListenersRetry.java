package com.crm.ListenersCode;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenersRetry implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		int start=0;int end =2;
		while(start<end) {
			start++;
			return true;
		}
		return false;
	}

}
