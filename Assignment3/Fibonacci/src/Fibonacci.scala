import scala.io.StdIn.readInt;

object Fibonacci {
  
  def fib(numb:Int):Int = numb match{
    case 0 => 0;
    case 1 => 1;
    case _ => fib(numb-1) + fib(numb-2); 
  }

  def fibPrint(numb:Int):Unit = {
        if(numb == 0){
      print(fib(numb)+"\t");
    }
        else{
      fibPrint(numb-1);
      print(fib(numb)+"\t");
    }
  }
  
  def main(args:Array[String]){
  println("Enter the number of element wants in series: ");
  val numb:Int=readInt();
  
  println(fibPrint(numb));
  
  }
}