package example
/**
  * Created by parunya on 7/8/2560.
  */
class classAndObject {
  case class Cat(val colour: String, val food: String)
  val oswald = new Cat("Black", "Milk")
  val henderson = new Cat("Ginger", "Chips")
  val quentin = new Cat("Tabby and white", "Curry")
  object ChipShop{
    def willServe(cat:Cat):Boolean =
      if (cat.food == "Chips")
        true
      else false
  }
}

