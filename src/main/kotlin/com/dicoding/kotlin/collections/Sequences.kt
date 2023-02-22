package com.dicoding.kotlin.collections

fun sequences() {
  // lazy evaluation -> vertical evaluation

  // this is eager evaluation
  val list = (1..1000000).toList()
  // list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

  // to implement lazy evaluation we must call asSequence() function
  list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.take(5).forEach { println(it) }

  val sequenceNumber = generateSequence(1) { it + 1 }
  sequenceNumber.take(5).forEach { print("$it ") }
  println()
}