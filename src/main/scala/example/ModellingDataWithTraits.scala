package example
/**
  * Created by parunya on 9/8/2560.
  */
object ModellingDataWithTraits {
/*trait Feline
{
  def color:String
  def sound:String = "roar"
}
  case class Lion(color:String,maneSize:Int)extends Feline
  {
    val sound = "roar"
  }
  case class Tiger(color:String,maneSize:Int)extends Feline
  {
    val sound = "roar"
  }
  case class Panthers(color:String,maneSize:Int)extends Feline
  {
    val sound = "roar"
  }
  case class Cat(color:String,food:String)extends Feline
  {
    val sound = "meow"
  }
 /* Another alterna ve to define an intermediate type, perhaps called BigCat that defines sound as "roar" . This
  is a be er solu on.*/
 trait BigCat extends Feline {
   val sound = "roar"
 }*/
trait Shape
{
  def sides:Int
  def perimeter:Double
  def area:Double
}
/*
  trait Rectangular extends Shape
  {
    val side = 4
    val perimeter = 2 * width + 2 * height
    val area = width*height
    def width:Int
    def height:Int
  }
  case class Circle(radios:Double)extends Shape
  {
    val side =1
    val perimeter = 2 * math.Pi * radios
    val area = math.Pi*radios * radios
  }
  case class Rectangle(val width:Int,val height:Int)extends Rectangular
  case class Square(val width:Int,val height:Int)extends Rectangular

*/

}
