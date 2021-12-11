package com.knoldus

object MainObject extends App {

  var personOne = new Person("Test",25)
  var personTwo = new Person("Test",24)
  println(personOne < personTwo)
  var personThree = new Person("Test",25)
  var personFour = new Person("Testagain",24)
  println(personThree < personFour)
}
