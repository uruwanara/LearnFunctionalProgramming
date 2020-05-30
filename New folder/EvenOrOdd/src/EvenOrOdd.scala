import scala.io.StdIn.readInt

object EvenOrOdd {
  
  def isOdd(numb:Int):Boolean= numb%2 match{
    case 1 => true;
    case 0 => false;
    
  }
  
  def checker(numb:Int):Int={
       println("Insert the Number");
    var numb:Int=readInt();
    
    if(isOdd(numb)){
      println(numb+" is a Odd number");
      
    }
    else
      {
      println(numb+" is a even number");
    }
    checker(1);
  }
  
  
 def main(args:Array[String]){
       checker(1);
    
  }
}