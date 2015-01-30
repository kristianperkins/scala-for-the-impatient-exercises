import scala.util.Random

// 1

val n = 50
var l = for (i <- 1 to n) yield Random.nextInt(n)
println(l)

// 2

var a: Array[Int] = Array(1, 2, 3, 4, 5)
for (i <- 0 until (a.size, 2)) {
  if (i + 1 < a.size) {
    val swp = a(i)
    a(i) = a(i+1)
    a(i+1) = swp
  }
}
println(a.mkString(", "))

// 3

a = Array(1, 2, 3, 4, 5)
val result = (for (elem <- a.grouped(2)) yield elem.reverse).toList.flatten
println(result)

// 4
a = Array(1, 2, 3, 4, 5, -2, -3, -7, 8, 0)
a.filter { _ > 0 } ++ a.filter { _ <= 0 }
println(a.mkString(", "))

// 5

var b = Array(1, 2, 3, 4.0)
println(b.sum / b.size)

// 6

println(a.sorted.reverse)
// also works for ArrayBuffer

// 7

a = Array(1, 1, 2, 2, 2, 3, 4)
println(a.distinct)

// 9

import java.util.TimeZone
val tz = TimeZone.getAvailableIDs.filter { _.startsWith("America/") }.map { _.drop(8) }.sorted
println(tz.mkString(", "))

// 10

import collection.mutable.ArrayBuffer
import java.awt.datatransfer._

val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
println(ArrayBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor)))
