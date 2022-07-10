

object functions 
{
  def wage(hrs : Int) : Int = hrs * 250;
  def ot(hrs : Int) : Int = hrs * 85;
  def takeHome(h1 : Int, h2 : Int) : Double = (wage(h1) + ot(h2)) * 0.88
  
  def main(args: Array[String])
  {
    println(takeHome(40, 30));
  }
}