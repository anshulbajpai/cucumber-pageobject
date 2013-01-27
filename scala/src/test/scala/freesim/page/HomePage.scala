package freesim.page

import core.BrowserPage

class HomePage extends BrowserPage{

  def isSignInTextPresent {

    find(XPathQuery("//span[@class='orderFormHeaderText']")) match {
       case Some(e) => e.text shouldBe("Sign up")
       case None => fail("Sign up text not found")
     }
  }

  def verifyTitle(expectedTitle: String) {
    pageTitle shouldBe  expectedTitle
  }

  def chose(planName: String){
    clickOn(XPathQuery("//div[@id='"+ planName +"']//input[@class='orderNowPlanButton']"))
  }
}
