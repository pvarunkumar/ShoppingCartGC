object Main {
  def main(args: Array[String]): Unit = {

    println("[" + args.mkString(", ") + "] => £" + ShoppingCart.scTotal(args))

  }
}
