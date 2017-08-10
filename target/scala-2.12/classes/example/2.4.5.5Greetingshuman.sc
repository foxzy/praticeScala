object person{
  val firstname = "Dave"
  val lastName = "Gurnell"
}
object alien{
  def greet(p:person.type ) = "Greeting , " + p.firstname + " " + p.lastName
}
alien.greet(person)