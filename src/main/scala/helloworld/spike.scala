package helloworld
import collection.immutable.TreeMap

class Hello(greeting : String){
  def sayHi = greeting + " World"
}

class ShoppingList(val items : List[Item]){
  def print = items.sortWith(_.count < _.count).map((i) => "%s %s".format(i.count, i.name)).mkString("\n") + "\n"
}

class Item(val name : String, val count : Int)