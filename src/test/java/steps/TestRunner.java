package steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features={"src/main/resources/features"}, 
		glue= {"steps"},
		monochrome = false,
		plugin={"pretty","html:target/HtmlReports/report.html"}
		)

public class TestRunner {

}
