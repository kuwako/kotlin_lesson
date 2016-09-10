fun sayHi(name: String = "masaki", age: Int = 23) {
  println("Hi, $name ($age)")
}

fun sayHello(): String {
  return "Hi!!!!!!!!"
}
/*
上記の関数同値
fun sayHello(): String = "Hi!!"
fun sayHello() = "Hi!!"
*/

fun main(args: Array<String>) {
  // for
  for (i in 0..9) {
    if (i == 5) break
    println(i)
  }

  // 関数の使い方
  sayHi("tom", 22)
  sayHi("kuwako", 30)
  sayHi()
  sayHi(age = 19, name = "Steve")

  val msg = sayHello()
  println(msg)
}
