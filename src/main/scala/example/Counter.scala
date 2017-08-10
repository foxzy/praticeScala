package example

/**
  * Created by parunya on 7/8/2560.
  */
/*class Counter(val count:Int){
  def dec = new Counter(this.count -1)
  def inc = new Counter(this.count +1)
}*/
/*class Counter(val count:Int){
  def dec: Counter = dec()
  def inc: Counter= inc()
  def dec(amount: Int = 1): Counter = new Counter(count - amount)
  def inc(amount: Int = 1): Counter = new Counter(count + amount)
}*/
class Adder(amount: Int) {
  def apply(in: Int) = in + amount
}
class Counter(val count:Int){
  def dec = new Counter(this.count -1)
  def inc = new Counter(this.count +1)
  def adjust(adder: Adder) =
    new Counter(adder.apply(count))
}

