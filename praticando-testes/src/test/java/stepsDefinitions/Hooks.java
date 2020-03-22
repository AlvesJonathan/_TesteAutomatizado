package stepsDefinitions;

import static utils.Utils.acessarSistema;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		acessarSistema();
	}
	
	@After
	public void tearDown() {
//		driver.quit();
	}

}
