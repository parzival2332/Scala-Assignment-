

object HelloWorld 
{
  def main(args: Array[String])
  {
    var (a, b, c, d) = (2, 3, 4, 5);
    var k : Float = 4.3f;
    
    b -= 1;
    d -= 1;
    println(b * a + c * d);
    a += 1;
    println(a);
    c += 1;
    println(c)
    c = ((c+1)*(a+1));
    println(c);
  }
}