package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class) //if you you get error here remove   <scope>test</scope> in cucumberjunit and import here and change <properties> to utf
@CucumberOptions(//add cucumber-core latest dependency in pom to remove x from pom
		features = "C:\\QA\\Selenium_Workplace\\BddFramework_Cucumber\\src\\main\\java\\Features\\taggedhooks.feature", //the path of the feature files
		glue={"stepDefinitions"}, //the path of the step definition files
		plugin= {"pretty","html:test-output/index.html","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//to generate different types of reporting
		//format= {"pretty","html:test-outout", "json:json_output/cucumber.json"}, //to generate different types of reporting but format is deprecated we use plugin now
		monochrome = true, //display the console output in a proper readable format
		//strict = true, //it will check if any step is not defined in step definition file, itwill execute the test cases
		dryRun = false //to check the mapping is proper between feature file and step def file then change it to false, because it will not execute the test cases
		//tags = "@SmokeTest or  @RegressionTest"		
		)

public class My_runner {

}
//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
