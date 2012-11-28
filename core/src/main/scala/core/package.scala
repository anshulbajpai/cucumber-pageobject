import core.implicitconverters.DataTableConverter
import cucumber.api.DataTable

package object core {
  implicit def dataTableToListConverter(dataTable : DataTable) = new DataTableConverter(dataTable)
}
