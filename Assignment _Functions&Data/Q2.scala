object subs extends App{
  val x=new Rational(3,4)
  val y=new Rational(5,8)
  val z=new Rational(2,7)
  val temp=y+z
  val ans=x-temp
  println(ans)
}
class Rational(n:Int,d:Int){
  def num = n
  def den = d
  def neg=new Rational(- this.num,this.den)
  def +(r:Rational)=new Rational(this.num* r.den + this.den* r.num, r.den* this.den)
  def -(r:Rational)= this+ r.neg
  override def toString=num+ "/" +den
}
