import scala.math

// 2
println(math.pow(math.sqrt(3), 2))

// 3
// <console>:8: error: reassignment to val
// definitely val

// 4
// StringOps

// 6
println(BigInt(2).pow(1024))

// 7
import BigInt.probablePrime
import scala.util.Random

println(probablePrime(100, Random))

// 8
println(BigInt(128, Random).toString(36))

// 9
val word = "word"
println(word(0))
println(word.last)
// unfortunately no luck for negative indexes or slices like:
// word(-1)

