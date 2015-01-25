
// 1
def signum(num: Int) = {
  if (num > 0) 1
  else if (num == 0) 0
  else -1
}

println(signum(-10))
println(signum(0))
println(signum(10))


// 2

println({}.getClass)
// res1: Class[Unit] = void

// 3

var x: Unit = _
var y: Int = _
x = y = 1

// 4

for (i <- (0 to 10).reverse) println(i)

// 5

def countdown(n: Int) {
  for (i <- (0 to n).reverse) println(i)
}
countdown(5)

// 6
var total = 1
for (c <- "Hello") total *= c
println(total)

// 7

var total = 1
"Hello".foreach { total *= _ }
println(total)

// 8
def product(str: String) = {
  var total = 1
  str.foreach { total *= _ }
  total
}
println(product("Hello"))
