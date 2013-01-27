import core.implicitconverters.DataTableConverter
import cucumber.api.DataTable

package object core {
  implicit def dataTableConverter(dataTable : DataTable) = new DataTableConverter(dataTable)
}
