import scala.math.Pi

class Temp(){
  def convert(a: Int): Unit = {
    val ans: Double = a*1.8+32
    println(s"$a degrees Celsius to Fahrenheit = " + ans + "\n")
  }
}

class Sphere(){
  def volume(r: Int): Unit = {
    val ans: Double = (Pi*r*r*r*4) / 3
    println(s"Volume of a sphere of radius $r = " + (ans*100).round/100.toDouble + "\n")
  }
}

class Wholesale(){
  val price: Double = 24.95

  def copies(num: Int): Unit = {
    val total: Double = if (num>50) num*price*0.6 + 3 + (num-50)*0.75 else num*price*0.6 + 3
    println(s"Total cost for $num copies = Rs. " + (total*100).round/100.toDouble)
  }
}

object Assignment_1{
  def main(args: Array[String]): Unit = {
    val a = new Temp()
    a.convert(35)

    val b = new Sphere()
    b.volume(5)

    val c = new Wholesale()
    c.copies(60)
  }
}