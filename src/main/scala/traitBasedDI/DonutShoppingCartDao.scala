package traitBasedDI

trait DonutShoppingCartDao[A] {
  val donutDatabase: DonutDatabase[A] // dependencyInjection is needed here

  def add(donut: A): Long = {
    println(s"DonutShoppingCartDao-> add method -> donut: $donut")
    donutDatabase.addOrUpdate(donut)
  }

  def update(donut: A): Boolean = {
    println(s"DonutShoppingCartDao-> update method -> donut: $donut")
    donutDatabase.addOrUpdate(donut)
    true
  }

  def search(donut: A): A = {
    println(s"DonutShoppingCartDao-> search method -> donut: $donut")
    donutDatabase.query(donut)
  }

  def delete(donut: A): Boolean = {
    println(s"DonutShoppingCartDao-> delete method -> donut: $donut")
    donutDatabase.delete(donut)
  }
}
