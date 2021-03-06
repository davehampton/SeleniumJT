package com.selenium.sample.main;

import org.testng.annotations.Test;

import com.jt.selenium.testng.SeleniumTestNG;
import com.selenium.sample.page.GoogleSearch;

/**
 * This is a very simple sample test to verify the project is run correctly.
 * 
 * This class illustrates how to use PageObjects within a Java Test class. It is
 * run via XML, simply running this test standalone will not work as the
 * framework requires extra data that only the XML can provide.
 * 
 * @author Dave.Hampton
 * 
 */
public class SampleTest extends SeleniumTestNG {

	@Test
	public void test() throws Exception {
		/**
		 * This is calling a PageObject and delegates the testing to it.
		 */
		GoogleSearch googleSearch = new GoogleSearch(test);
		googleSearch.openGoogle();
		googleSearch.typeValue("RDF Group");
		googleSearch.checkResult("Offering a complete portfolio of IT services");
	}

}
