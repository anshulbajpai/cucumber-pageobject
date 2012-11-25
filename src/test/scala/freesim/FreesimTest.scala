package freesim

import cucumber.junit.Cucumber.Options
import cucumber.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@Options(features = Array("classpath:freesim"), glue = Array("freesim.steps", "core.steps"))
class FreesimTest