// Class
open class User(var name: String) {
  var team = "red"
  // getter拡張
  get() {
    return field.toUpperCase()
  }
  // setter拡張
  set(value) {
    if (value != "") {
      field = value
    }
  }
  init {
    println("instance created: name: $name, team: $team")
  }
  open fun sayHi() {
    println("hi $name")
  }
}

// 継承
class AdminUser(name: String): User(name) {
  fun sayHello() {
    println("Hello $name")
  }

  override fun sayHi() {
    println("hi $name overrided")
  }
}

fun main(args: Array<String>) {
  val tom = User("tom") // 型推論される
  println(tom.name)
  tom.sayHi()
  tom.name = "kuwako"
  tom.sayHi()

  val bob = AdminUser("bob")
  println(bob.name)
  bob.sayHello()
  bob.sayHi()
}
