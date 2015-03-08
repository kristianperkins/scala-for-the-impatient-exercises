// 1

val gizmos = Map("Bathroom Buddy" -> 50, "Electric Hammer" -> 30, "Ultimate Fly Swatter" -> 15)
val d = for ((k, v) <- gizmos) yield (k, v * 0.9)
println(d)

// 2

import java.io.File
val counter = new collection.mutable.HashMap[String, Int]().withDefaultValue(0)
var in = new java.util.Scanner(new File("myfile.txt"))
Iterator.continually(in.next).takeWhile(_ => in.hasNext()).foreach(word => counter(word) += 1)
println(counter)
in.close()

// 3

var ic = new collection.immutable.HashMap[String, Int]().withDefaultValue(0)
in = new java.util.Scanner(new File("myfile.txt"))
Iterator.continually(in.next).takeWhile(_ => in.hasNext()).foreach(word =>
    ic = ic + ((word, ic(word) + 1))
)
println(ic)
in.close()

// 4

var sc = new collection.immutable.TreeMap[String, Int]().withDefaultValue(0)
in = new java.util.Scanner(new File("myfile.txt"))
Iterator.continually(in.next).takeWhile(_ => in.hasNext()).foreach(word =>
    sc = sc + ((word, sc(word) + 1))
)
println(sc)
in.close()

// 7

import collection.JavaConversions.propertiesAsScalaMap
val props: collection.Map[String, String] = System.getProperties()
val size = (for (k <- props.keySet) yield k.size).max + 1
for ((k, v) <- props) println(s"%-${size}s| %s".format(k, v))

