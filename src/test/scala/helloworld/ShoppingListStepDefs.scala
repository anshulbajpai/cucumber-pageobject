package helloworld

import cucumber.table.DataTable
import core.DataTableConverter._

class ShoppingListStepDefs extends StepDefs{

  var shoppingList : ShoppingList = null
  var printedList : String = null

  Given("""^a shopping list:$"""){(dataTable : DataTable) =>
    shoppingList = new ShoppingList(dataTable.toList[Item])
  }

  When("""^I print that list$"""){
    printedList = shoppingList.print
  }

  Then("""^it should look like:$"""){ (output:String) =>
    printedList should equal(output)
  }
}
