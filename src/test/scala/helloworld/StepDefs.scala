package helloworld

import cucumber.runtime.{EN, ScalaDsl}
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.selenium.WebBrowser

trait StepDefs extends ScalaDsl with EN with ShouldMatchers