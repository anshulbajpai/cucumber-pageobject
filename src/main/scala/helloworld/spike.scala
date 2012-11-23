package helloworld
import collection.immutable.TreeMap

class Hello(greeting : String){
  def sayHi = greeting + " World"
}

class ShoppingList(items : TreeMap[String,Int] = TreeMap.empty){
  def addItem(name :String, count : Int) = new ShoppingList(items + (name -> count))
  def print = items.map{e => e._1 + " " + e._2}.mkString("\n")
}