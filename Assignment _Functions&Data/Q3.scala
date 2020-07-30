object bank extends App{
  val a1=new account("Uthpala", "972232475V", 2000140,1500.00)
  val a2=new account("Manul", "9788574V", 2000155,2500.00)
  println("Holder\tNIC\t\tAccNum\tBal")
  println(a1)
  println(a2)
  a1.transfer(a2,500.00)
  println("-------  Transfered - 500.00 ----------  ")
  println(a1)
  println(a2)
}
class account(name:String,nic:String,n:Int,balance:Double){
  val nameS:String=name
  val id:String=nic
  val acnumber:Int=n
  var bal :Double=balance
  override def toString= nameS+ "\t"+id + "\t" +acnumber+ "\t" +bal
  def withdraw(a:Double)=
    {this.bal=this.bal-a}
  def deposit(a:Double)=
    this.bal= this.bal+a
  def transfer(a:account,b:Double)={
    this.withdraw(b)
    a.deposit(b)
  }
}
