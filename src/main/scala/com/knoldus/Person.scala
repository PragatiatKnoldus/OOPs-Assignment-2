package com.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person]{

  override def compare(that: Person): Int = {

    val result = this.name compare that.name
    result match {
      case 0 => if (this.age > that.age) 1 else -1
      case _ => if (this.name.length > that.name.length) 1 else -1
    }
  }
}