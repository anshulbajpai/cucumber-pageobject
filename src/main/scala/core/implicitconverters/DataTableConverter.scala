package core.implicitconverters

import cucumber.table.DataTable
import scala.collection.JavaConversions._

class DataTableConverter(dataTable : DataTable){
  def toList[T](implicit m : Manifest[T]) : List[T] = dataTable.asList[T](m.erasure).toList
}

