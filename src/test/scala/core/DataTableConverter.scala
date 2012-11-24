package core

import cucumber.table.DataTable
import scala.collection.JavaConversions._

object DataTableConverter {
  implicit def dataTableToListConverter(dataTable : DataTable) = new DataTableConverter(dataTable)

  class DataTableConverter(dataTable : DataTable){
    def toList[T](implicit m : Manifest[T]) : List[T] = dataTable.asList[T](m.erasure).toList
  }
}
