package StepDefinition;


import base.Keywords;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.FileNotFoundException;


public class StepBase {

	@Before
	public void beforeScenario() throws FileNotFoundException {
		Keywords.launchApplication();
	}

	@After
	public void	afterScenario(){
		Keywords.quitDriver();
	}
}
