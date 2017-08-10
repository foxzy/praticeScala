package example
/**
  * Created by parunya on 7/8/2560.
  */
class DirectorialDebut {

  class Director(val firstName:String,val lastName:String,val yearOfBirth:Int)
  {
    def name ():String = s"$firstName $lastName"
    def copy(
              firstName: String = this.firstName,
              lastName: String = this.lastName,
              yearOfBirth: Int = this.yearOfBirth): Director =
         new Director(firstName, lastName, yearOfBirth)
  }
  class Film(val name:String,val yearOfRelease:Int,val imdbRating:Double,val director:Director)
  {
    def directorsAge = yearOfRelease - director.yearOfBirth
    def isDirectorBy(director:Director)=
      {
        this.director == director
      }
  }
}
