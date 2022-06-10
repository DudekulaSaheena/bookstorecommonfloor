package countryside;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DSAHEENA\\Desktop\\API testing\\REST Assured\\countryside\\src\\test\\resources\\fetaures",glue= {"countryside"},
monochrome = true)
public class loginrunner {

}
