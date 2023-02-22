package com.dicoding.kotlin.collections

fun operations() {
  val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  // filter() and filterNot()
  val evenList = numberList.filter { it % 2 == 0 }
  println(evenList)
  val notEvenList = numberList.filterNot { it % 2 == 0 }
  println(notEvenList)

  // map()
  val multipliedBy5 = numberList.map { it * 5 }
  println(multipliedBy5)

  // count()
  println(numberList.count())
  println(numberList.count{it % 3 == 0})

  // find(), firstOrNull()
  val firstOddNumber = numberList.find { it % 2 == 1 }
  val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
  println(firstOddNumber) // 1
  println(firstOrNullNumber) // null

  // first(), last()
  val moreThan10 = numberList.first { it > 10 }
  // println(moreThan10) // error  Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.

  // sum()
  val total = numberList.sum()
  println(total) // 55

  // sorted()
  val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')

  val ascendingSort = kotlinChar.sorted()
  println(ascendingSort) // ascendingSort: [i, k, l, n, o, t]

  val descendingSort = kotlinChar.sortedDescending()
  println(descendingSort) // descendingSort: [t, o, n, l, k, i]
}