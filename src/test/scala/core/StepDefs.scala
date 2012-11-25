package core

import cucumber.runtime.{EN, ScalaDsl}

trait StepDefs[T <: BrowserPage] extends ScalaDsl with EN {
  private var internalPage: Option[T] = None

  def page(implicit m: Manifest[T]): T = internalPage match {
    case Some(p) => p
    case None => internalPage = Some(m.erasure.newInstance().asInstanceOf[T]); internalPage.get
  }
}