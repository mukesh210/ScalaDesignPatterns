package traitBasedDI

object DonutShoppingCartBootstrap extends App {
  val donutShoppingCart = new DonutShoppingCart[String]()

  donutShoppingCart.add("Vanilla Donut")
  donutShoppingCart.update("Vanilla Donut")
  donutShoppingCart.search("Vanilla Donut")
  donutShoppingCart.delete("Vanilla Donut")

  donutShoppingCart.checkStockQuantity("Vanilla Donut")
}
