// Collection
/*
  - List
  - Set
  - Map
*/

fun main(args: Array<String>) {
  val sales: List<Int> = listOf(20, 30, 40)
  println(sales[1])
  println(sales.size)
  for (sale in sales) {
    println(sale)
  }

  val salesMutable = mutableListOf(20, 30, 40)
  println(salesMutable[1])
  salesMutable[1] = 50
  for (saleM in salesMutable) {
    println(saleM)
  }

}
