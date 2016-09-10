// generics
class MyInteger {
  fun getThree(x: Int) {
    println(x)
    println(x)
    println(x)
  }
}

class MyData<T> {
  fun getThree(x: T) {
    println(x)
    println(x)
    println(x)
  }
}

// data class
data class Point(val x: Int, val y: Int)

fun main(args: Array<String>) {
  val mi = MyInteger()
  mi.getThree(55)

  val i = MyData<Int>()
  i.getThree(22)

  val s = MyData<String>()
  s.getThree("Hello")

  val p1 = Point(3,5)
  val p2 = Point(3,5)

  println(p1)
  println(if (p1 == p2) "same" else "not same")
}
