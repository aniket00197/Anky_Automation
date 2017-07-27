package Runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

/**
 * Created by aniket on 6/25/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features={"src//test//resources"},glue = {"stepDefination"})
public class TestRunner {

}
