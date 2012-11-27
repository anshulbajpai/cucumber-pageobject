import core.implicitconverters.DataTableConverter
import cucumber.table.DataTable

package object core {
  implicit def dataTableToListConverter(dataTable : DataTable) = new DataTableConverter(dataTable)
}
