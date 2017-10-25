object ShoppingCart {

  val scItemPrice = Map("Apple" -> 0.6, "Orange" -> 0.25)

  def scTotal(scItems: Array[String]): BigDecimal = {

    var scTotal: BigDecimal = 0

    for (scItem <- scItems)
      scTotal += scItemPrice(scItem)

    scTotal
  }
}
