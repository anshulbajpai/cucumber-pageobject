package freesim

import org.junit.runner.RunWith
import cucumber.api.junit.Cucumber
import cucumber.api.junit.Cucumber.Options

@RunWith(classOf[Cucumber])
@Options(features = Array("classpath:freesim"), glue = Array("freesim.steps"))
class FreesimTest