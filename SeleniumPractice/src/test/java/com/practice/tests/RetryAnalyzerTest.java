package com.practice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerTest {

	@Test(retryAnalyzer = com.Analyzer.RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(true, false);
	}
	
	@Test(retryAnalyzer = com.Analyzer.RetryAnalyzer.class)
	public void test2() {
		Assert.assertEquals(true, false);
	}
}
