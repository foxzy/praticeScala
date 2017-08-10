package example
/**
  * Created by parunya on 8/8/2560.
  */
case class Person (name:String,lastname:String)
class FriendlyPersonFactory
{
  object objectPerson{
    def apply(name: String): Person = {
      val parts = name.split(" ")
      new Person(parts(0),parts(1))
    }

  }
}


