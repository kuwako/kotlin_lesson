fun main(args: Array<String>) {
  val prices = listOf(53.2, 48.2, 32.8)
  prices
  /*.map { n -> n * 1.08 } // 引数 -> 処理*/
  .map { it * 1.08 }
  /*.filter { n -> n > 50 } */
  .filter { it > 50 }
  .forEach { println(it) }
}
