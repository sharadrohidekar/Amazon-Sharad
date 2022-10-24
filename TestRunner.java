package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Sharad\\amazon\\src\\main\\java\\feature\\amazon.feature" 
		,glue={"stepDefinition"},
		format= {"pretty", "html:test-output"}
		
		
		)


public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
