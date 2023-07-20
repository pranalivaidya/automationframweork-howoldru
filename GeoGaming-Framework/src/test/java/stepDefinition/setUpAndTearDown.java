package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class setUpAndTearDown extends baseClass {
	
	@Before
	public void setUp() {
		launchBrowser();
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
