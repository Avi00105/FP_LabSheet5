object L5_4 {

  def evenOdd(n:Int):Unit={

        n match {
          case 0 =>println("even")

          case 1 =>println("Odd")

          case _ =>evenOdd(n-2)
        }
  }


  def main(args:Array[String]):Unit={
    //checking 2 is even or Odd
    val result1=evenOdd(2);

    //checking 3 is even or odd
    val result2=evenOdd(3);



  }

}
