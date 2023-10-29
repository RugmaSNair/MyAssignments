package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;

//monochrome=true removes all the junk from the console
//publish=true gives the cucumber report in the console

@CucumberOptions(features={"src/test/java/feature/TC003_DeleteLead.feature"},glue="stepDefinition",
                monochrome=true,publish=true)

public class Runner extends BaseClass {

}
