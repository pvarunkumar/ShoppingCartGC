object ShoppingCart {

  val scItemPrice = Map("Apple" -> 0.6, "Orange" -> 0.25)

  def scTotal(scItems: Array[String]): BigDecimal = {

    var scTotal: BigDecimal = 0

    for (scItem <- scItems)
      scTotal += scItemPrice(scItem)

    scTotal - scDiscount(scItems)

  }


  def scDiscount(scItems: Array[String]): BigDecimal = {

    var discTotal: BigDecimal = 0
    val AppleCount = scItems.count(itm => itm == "Apple")
    val OrangeCount = scItems.count(itm => itm == "Orange")

    discTotal = BigDecimal.decimal((AppleCount / 2) * scItemPrice("Apple")) + ((OrangeCount / 3) * scItemPrice("Orange"))

    discTotal
  }
}
