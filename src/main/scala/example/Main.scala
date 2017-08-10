package example

/**
  * Created by parunya on 4/8/2560.
  *
  *
  */
object Main extends App {
  object calc{
    def square(x:Double) = x*x
    def cube(x:Double) = x*square(x)
    print(calc.cube(10))
  }
  val scope = new ConcatString()
  val c = new classAndObject()
  val x = new DirectorialDebut()
  val _p= new FriendlyPersonFactory()
  val _ptMatching = new PatternMatching()

  println(scope.prob.borderline)
  println(scope.topic(scope.prob,"OBJECTS AND CLASSES"));
  println(c.oswald.colour + c.oswald.food)
  println(c.henderson.food + c.henderson.colour)
  println(c.quentin.colour + c.quentin.food)
  val res = c.ChipShop.willServe(Main.c.henderson)
  println(res)
  /* println(new Counter(10).inc
 .dec.inc.inc.count)*/
 /* println(new Counter(10).adjust(new Adder(10)).count)*/
  println(new Adder(3).apply(2))
  val resPerson = _p.objectPerson.apply("Mr.Perfect Man")
  println(this.resPerson.name)
  println(scope.prob.borderline.concat("END"))

  println(scope.topic(scope.prob,"PatternMatching"));
  println(_ptMatching.Stormtrooper.inspect(new Main._ptMatching.Person("Han", "Solo")))
  println(_ptMatching.Stormtrooper.inspect(new Main._ptMatching.Person("Olay", "Woo")))
  val maliMeaw = new _ptMatching.Cat("Ginger", "Chips")
  println(_ptMatching.ChipShop.willServe(maliMeaw))

  val Director = new _ptMatching.Director("John","Eastwood",0)
  val film = new _ptMatching.Film("",0,0.0,this.Director)
  val dad = _ptMatching.Dad.rate(film)
  println(dad);
  println(scope.prob.borderline.concat("END"))
  println(scope.topic(scope.prob,"MODELLING DATA WITH TRAITS"));
  val _draw = new DrawShape()
  println("CIRCLE :" + _draw.Draw.apply(Main._draw.Circle(10)))
  println("RECTANGLE :" + _draw.Draw.apply(Main._draw.Rectangle(3,4)))
  println(_draw.Draw.apply(Main._draw.Circle(10)))



}



