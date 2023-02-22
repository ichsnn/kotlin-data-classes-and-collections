package com.dicoding.kotlin.collections

fun map() {
  var capital = mapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "New Delhi" to "India"
  )

  println(capital["Jakarta"])
  println(capital.getValue("Jakarta"))
  println(capital["Amsterdam"]) // null
  // println(capital.getValue("Amsterdam")) // Output: Exception in thread "main" java.util.NoSuchElementException: Key Amsterdam is missing in the map.
  val mapKeys = capital.keys
  println(mapKeys)
  val mapValues = capital.values
  println(mapValues)

  // like other Collections
  val mutableCapital = capital.toMutableMap()
  mutableCapital.put("Amsterdam", "Netherlands")
  mutableCapital.put("Berlin", "Germany")
  println(mutableCapital.keys)
  println(mutableCapital.values)
}