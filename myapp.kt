fun main(args: Array<String>) {
  /*val msg: String = "Hello World"*/
  val msg = "Hello World" // 型推論
  var msg2 = "Goodmorning" // valは変更不可能。varは変更可能

  println(msg)
  // msg = "Hello World 2" // myapp.kt:9:3: error: val cannot be reassigned
  println(msg2)
  msg2 = "Goodnight"
  println(msg2)
  println("hello " + "world")

  val name = "kuwako"
  println("my name is $name")
  println("my score is ${12 + 32}")

  val score = 85
  val result = if (score > 85) "Great" else "so so ..."
  println(result)

  // when 他の言語でいうswitch
  val num = 3

  val result2 = when (num) {
    0 -> println("Zero")
    1 -> println("One")
    2, 3 -> println("Two or Three")
    in 4..19 -> println("Many")
    else -> println("Other")
  }
  println(result2)

  /* null-safety */
  // val foo: String = null // コンパイルエラー
  var bar: String? = null
  bar = "null-safety"
  // bar.length // nullの可能性があるためコンパイルエラー
  if (bar != null) {
    bar.length // OK
  }

  /* 拡張関数 */
  // Intクラスに関数を追加可能
  fun Int.odd() = this % 2 != 0

  /* 関数リテラル */
  val seyHello = {
    (name: String) ->
    println("Hello, $name")
  }

  sayHello("Taro")

}
