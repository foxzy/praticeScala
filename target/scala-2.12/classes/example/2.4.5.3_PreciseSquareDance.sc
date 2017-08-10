object calc2 {
  def square(x: Double) = x * x
  def cube(x: Double) = x * square(x)

  def square(x: Int) = x * x
  def cube(x: Int) = x * square(x)
}
calc2.square(1.0)
calc2.square(1)
