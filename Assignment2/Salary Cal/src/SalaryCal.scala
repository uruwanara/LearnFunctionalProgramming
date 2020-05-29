
import scala.io.StdIn.readInt;

object SalaryCal {
  
  def takeHomeSal(wh:Double,ot:Double)=(wh*150+ot*75)*0.9;
  
  def main(args: Array[String]){
    println("Enter Working Hours :" );
    var wh:Int=readInt();
    println("Enter OT hours :" );
    var oh:Int=readInt();
    
    printf("Salary per week : "+takeHomeSal(wh,oh) );
    
  }
}