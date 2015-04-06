// 1

class Counter {
  private var value: Int = 0
  // added constructor for easy testing
  def this(value: Int) {
    this()
    this.value = value
  }
  def increment() { value = math.max(0, value + 1) }
  def current() = value
}
val c = new Counter(Int.MaxValue)
c.increment
assert(c.current >= 0)

// 2

class BankAccount {
  private var bal = 0
  def deposit(amount: Int) { bal += amount }
  def withdraw(amount: Int) { bal -= amount }
  def balance() = bal
}

val b = new BankAccount
b.deposit(100)
b.withdraw(40)
assert(b.balance == 60)

// 5

import scala.beans.BeanProperty

class Student {
  @BeanProperty var id: Long = _
  @BeanProperty var name: String = _
}
val s = new Student
s.setName("Fred Flintstone")
s.setId(1)
assert(s.getName == "Fred Flintstone")
assert(s.getId == 1)

// 6

class Person(val name: String, var age: Int) {
  age = math.max(0, age)
}
var p = new Person("Fred", -5)
assert(p.age == 0)

// 7

class Person2(val name: String, var age: Int) {
  def first() = name.split(" ")(0)
  def last() = name.split(" ")(1)
}
val p2 = new Person2("Fred Flintstone", 30)
assert(p2.first == "Fred")
assert(p2.last == "Flintstone")
