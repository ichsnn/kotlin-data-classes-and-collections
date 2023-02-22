package com.dicoding.kotlin.collections

import java.lang.Error

fun list() {
  val numberList: List<Int> = listOf(1, 2, 3, 4, 5)
  val charList: List<Char> = listOf('a', 'b', 'c')
  val anyList = listOf('a', "Kotlin", 3, true)
  println((anyList[1] as String)[1])

  // list are immutable its mean we can't modify
  // we can use mutableListOf if we want modify the list

  val anyMutableList = mutableListOf('a', "Kotlin", 3, true)
  anyMutableList.add('d')
  anyMutableList.add(1, "love")
  anyMutableList[anyMutableList.size - 2] = 10
  anyMutableList.removeAt(0)
  anyMutableList.forEach {
    print("$it ")
  }
  println()
}