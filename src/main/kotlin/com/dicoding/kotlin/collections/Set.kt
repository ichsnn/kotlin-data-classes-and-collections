package com.dicoding.kotlin.collections

fun set() {
  var integerSet = setOf(1, 2, 4, 2, 1, 5)
  println(integerSet)

  val setA = setOf(1, 2, 4, 2, 1, 5)
  val setB = setOf(1, 2, 4, 5)
  println(setA == setB) // true

  println(5 in setA) // true

  val setC = setOf(1, 5, 7)
  val union = setA.union(setC)
  val intersect = setA.intersect(setC)

  println(union) // [1, 2, 4, 5, 7]
  println(intersect) // [1, 5]

  val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
  mutableSet.add(6) // add 6 to last index of the set
  mutableSet.remove(1) // remove the element with value 1
}