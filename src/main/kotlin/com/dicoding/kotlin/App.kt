import com.dicoding.kotlin.collections.list
import com.dicoding.kotlin.collections.map
import com.dicoding.kotlin.collections.operations
import com.dicoding.kotlin.collections.set
import com.dicoding.kotlin.dataclass.mainDataClass

/*
data class User(val name: String, val age: Int)

- the main constructor on that class at least have one params
- all main constructor must declared as val or var
- modifier on a data class can't be abstract, open, sealed, or inner
*/

fun main() {
  mainDataClass()
  println()

  list()
  println()

  set()
  println()

  map()
  println()

  operations()
  println()
}