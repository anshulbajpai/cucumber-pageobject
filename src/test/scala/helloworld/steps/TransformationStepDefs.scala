package helloworld.steps

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import org.scala_tools.time.Imports._
import core.StepDefs

class TransformationStepDefs extends StepDefs{

  val dateTimeFormat = DateTimeFormat.forPattern("MMM d, YYY")
  var today : DateTime = null
  var laundryDate : DateTime = null

  Given("""^today is "([^"]*)"$"""){ (date:String) =>
    today =  dateTimeFormat.parseOption(date) match {
      case Some(d) => d
      case None => throw new IllegalArgumentException
    }
  }

  Given("""^I did laundry (\d+) days ago$"""){ (days:Int) =>
       laundryDate = today - days.days
  }

  Then("""^my laundry day must have been "([^"]*)"$"""){ (laundryDate:String) =>
      this.laundryDate.toString(dateTimeFormat) should equal(laundryDate)
  }

}
