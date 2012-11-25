package helloworld

import cucumber.junit.Cucumber.Options
import org.junit.runner.RunWith
import cucumber.junit.Cucumber

@RunWith(classOf[Cucumber])
@Options(features = Array("classpath:helloworld"), glue = Array("helloworld.steps"))
class HelloWorldTest
