package freesim;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = {"classpath:freesim"}, glue = {"freesim.steps", "core.hooks"}, format = {"pretty", "html:target/cucumber-html-report"})
public class FreesimTest {
}
