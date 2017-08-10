package example
/**
  * Created by parunya on 8/8/2560.
  */
class PatternMatching {
  case class Person(firstName: String, lastName: String)
  object Stormtrooper {
    def inspect(person: Person): String =
      person match {
        case Person("Luke", "Skywalker") => "Stop, rebel scum!"
        case Person("Han", "Solo") => "Stop, rebel scum!"
        case Person(first, last) => s"Move along, $first"
      }
    /*   expr0 match {
         case pattern1 => expr1
         case pattern2 => expr2
           ...
       }*/
  }
  case class Cat(val colour: String,val food: String)
  object ChipShop {
    def willServe(cat:Cat):Boolean =
      cat match {
        case Cat(_,"Chips") => true
        case Cat(_,_)=> false
      }
  }
  case class Director(firstName: String, lastName: String, yearOfBirth: Int) {
    def name: String =
      s"$firstName $lastName"
  }
  case class Film(
              val name: String,
              val yearOfRelease: Int,
              val imdbRating: Double,
              val director: Director) {
    def directorsAge =
      director.yearOfBirth - yearOfRelease
    def isDirectedBy(director: Director) =
      this.director == director
    def copy(
              name: String = this.name,
              yearOfRelease: Int = this.yearOfRelease,
              imdbRating: Double = this.imdbRating,
              director: Director = this.director) =
      new Film(name, yearOfRelease, imdbRating, director)
  }


  object Dad{
    def rate(film:Film):Double =
      film match {
        case Film(_,_,_,Director("Clint","Eastwood",_)) => 10.0
        case Film(_,_,_,Director("John","McTiernan",_)) => 7.0
        case _=> 3.0
      }
  }

}

