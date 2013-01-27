package core.implicitconverters

import scala.collection.JavaConversions._
import cucumber.api.DataTable

class DataTableConverter(dataTable : DataTable){
//  def toList[T](implicit m : Manifest[T]) = dataTable.asList[T](m.runtimeClass).toList
//  def convert[T](implicit m : Manifest[T]) = dataTable.convert[T](m.runtimeClass)
}

