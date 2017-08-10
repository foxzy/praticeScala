package example

/**
  * Created by parunya on 9/8/2560.
  */
class DrawShape{
  trait Shape {
    def sides: Int
    def perimeter: Double
    def area: Double
  }
  sealed trait Rectangular extends Shape {
    def width: Double
    def height: Double
    val sides = 4
    val perimeter = 2*width + 2*height
    val area = width*height
  }
  final case class Square(size: Double, color: Color) extends Rectangular {
    val width = size
    val height = size
  }
  final case class Rectangle( width: Double,height: Double,color:Color) extends Rectangular
  final case class Circle(radius: Double, color: Color) extends Shape {
    val sides = 1
    val perimeter = 2 * math.Pi * radius
    val area = math.Pi * radius * radius
  }
  final case class CustomColor(
                                red: Double,
                                green: Double,
                                blue: Double) extends Color
  object Draw {
    def apply(shape: Shape): String = shape match {
      case Rectangle(width, height,color) =>
        s"A ${Draw(color)} rectangle of width ${width}cm and height ${height}cm"
      case Square(size,color) =>
        s"A ${Draw(color)} square of size ${size}cm"
      case Circle(radius,color) =>
        s"A ${Draw(color)} circle of radius ${radius}cm"
    }
  }
  /*The color and the shape*/
  sealed trait Color
{
  def red:Double
  def green:Double
  def blue:Double

  def isLight = (red + green + blue) / 3.0 > 0.5
  def isDark = !isLight
}
  final case object Red extends Color
  {
    val red = 1.0
    val green = 0.0
    val blue = 0.0
  }
  final case object  Yellow extends Color
  {
    val red = 1.0
    val green = 1.0
    val blue = 0.0
  }
  final case object Pink extends Color
  {
    val red = 1.0
    val green = 0.0
    val blue = 1.0
  }

}
