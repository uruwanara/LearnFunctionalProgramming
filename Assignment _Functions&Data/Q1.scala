object negative extends App{
  val r1=new Rational(5,3)
  println(r1.neg)
}
class Rational(n:Int,d:Int){
  def num = n
  def den = d
  def neg=new Rational(- this.num,this.den)
  override def toString=num+ "/" +den
}
