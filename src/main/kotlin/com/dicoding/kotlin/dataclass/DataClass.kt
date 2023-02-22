package com.dicoding.kotlin.dataclass

class User(val name: String, val age: Int) {
  // if we include this the object when printed will be like below
  // override fun toString(): String {
  //   return "User(name=$name, age=$age)"
  // }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as User

    if (name != other.name) return false
    if (age != other.age) return false

    return true
  }

  override fun hashCode(): Int {
    var result = name.hashCode()
    result = 31 * result + age
    return result
  }
}

data class DataUser(val name: String, val age: Int) {
  fun intro() {
    println("My name is $name, I am $age years old")
  }
}

fun mainDataClass() {
  val user = User("ichsan", 20)
  val dataUser = DataUser("ichsan", 20)

  println(user) // output: com.dicoding.kotlin.dataclass.User@75b84c92
  println(dataUser) // DataUser(name=ichsan, age=20)

  // benefits of data class is, we can use equals() function
  val dataUser1 = DataUser("ichsan", 20)
  val dataUser2 = DataUser("ichsan", 20)
  val dataUser3 = DataUser("ichsnn", 17)

  println(dataUser1.equals(dataUser2)) // true
  println(dataUser2.equals(dataUser3)) // false

  val user1 = User("ichsan", 20)
  val user2 = User("ichsan", 20)
  val user3 = User("ichsnn", 17)

  println(user1.equals(user2)) // true
  println(user1.equals(user3)) // false

  // copy
  val dataUser4 = dataUser3.copy()
  println(dataUser3.equals(dataUser4)) // true

  val dataUser5 = dataUser3.copy(age = 20)
  println(dataUser5)

  // destructing declartions
  val dataUser6 = DataUser("ichsnn", 21)
  val name = dataUser6.component1()
  val age = dataUser6.component2()
  println("My name is $name, I am $age years old") // My name is ichsnn, I am 21 years old
  dataUser6.intro()
}