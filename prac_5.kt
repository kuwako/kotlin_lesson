// Collection
/*
  - List
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
  for (saleMut in salesMutable) {
    println(saleMut)
  }

  val users = mapOf("kuwako" to 10, "masaki" to 20, "mask" to 30)
  println(users["kuwako"])
  println(users.size)
  println(users.keys)
  println(users.values)
  println(users.entries)
}
