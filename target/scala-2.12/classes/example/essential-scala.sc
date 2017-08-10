object Test7 {
  val simpleField = {
    println("Evaluating simpleField")
    42
  }
  def noParameterMethod = {
    println("Evaluating noParameterMethod")
    42
  }
}
Test7.simpleField
Test7.noParameterMethod

object calc{
  def square(x:Double) = x*x
  def cube(x:Double) = x*square(x)
}
calc.square(10)
calc.cube(10)
