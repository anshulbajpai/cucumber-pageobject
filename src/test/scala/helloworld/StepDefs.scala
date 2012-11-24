package helloworld

import cucumber.runtime.{EN, ScalaDsl}
import org.scalatest.matchers.ShouldMatchers

trait StepDefs extends ScalaDsl with EN with ShouldMatchers
